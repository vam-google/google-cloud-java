/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.bigtable.data.v2.it.env;

import com.google.cloud.bigtable.admin.v2.BigtableTableAdminClient;
import com.google.cloud.bigtable.admin.v2.BigtableTableAdminSettings;
import com.google.cloud.bigtable.data.v2.BigtableDataClient;
import com.google.cloud.bigtable.data.v2.BigtableDataSettings;
import com.google.common.io.CharStreams;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/** Java wrapper around the gcloud bigtable emulator. */
// TODO(igorbernstein): Clean this up and externalize this in a separate artifact
// TODO(igorbernstein): Stop depending on gcloud for the binary, instead wrap it in a jar.
class Emulator {
  private static final Logger LOGGER = Logger.getLogger(Emulator.class.getName());

  private final Path executable;
  private Process process;
  private boolean isStopped = true;
  private BigtableTableAdminClient tableAdminClient;
  private BigtableDataClient dataClient;

  private static final String PROJECT_ID = "fake-project";
  private static final String INSTANCE_ID = "fake-instance";

  // Use the gcloud installed emulator
  static Emulator createGCloud() {
    final Path gcloudSdkPath;

    try {
      gcloudSdkPath = getGcloudSdkPath();
    } catch (Exception e) {
      throw new RuntimeException("Failed to get the gcloud SDK path. Is it installed?", e);
    }

    Path emulatorPath =
        gcloudSdkPath.resolve(Paths.get("platform", "bigtable-emulator", "cbtemulator"));

    if (!Files.exists(emulatorPath)) {
      throw new RuntimeException(
          "cbtemulator is not installed, please install with `gcloud components install bigtable`");
    }

    return new Emulator(emulatorPath);
  }

  private Emulator(Path executable) {
    this.executable = executable;
  }

  void start() throws Exception {
    int availablePort = getAvailablePort();

    process = Runtime.getRuntime().exec(executable + " -port " + "" + availablePort);
    pipeStreamToLog(process.getInputStream(), Level.INFO);
    pipeStreamToLog(process.getErrorStream(), Level.WARNING);
    isStopped = false;

    waitForPort(availablePort);

    tableAdminClient =
        BigtableTableAdminClient.create(
            BigtableTableAdminSettings.newBuilderForEmulator(availablePort)
                .setProjectId(PROJECT_ID)
                .setInstanceId(INSTANCE_ID)
                .build());

    dataClient =
        BigtableDataClient.create(
            BigtableDataSettings.newBuilderForEmulator(availablePort)
                .setProjectId(PROJECT_ID)
                .setInstanceId(INSTANCE_ID)
                .build());

    Runtime.getRuntime()
        .addShutdownHook(
            new Thread() {
              @Override
              public void run() {
                if (!isStopped) {
                  isStopped = true;
                  process.destroy();
                }
              }
            });
  }

  void stop() throws Exception {
    try {
      dataClient.close();
      tableAdminClient.close();
    } finally {
      isStopped = true;
      process.destroy();
    }
  }

  BigtableDataClient getDataClient() {
    return dataClient;
  }

  BigtableTableAdminClient getTableAdminClient() {
    return tableAdminClient;
  }

  // <editor-fold desc="Helpers">
  private static Path getGcloudSdkPath() throws Exception {
    Process p = Runtime.getRuntime().exec("gcloud info --format=value(installation.sdk_root)");
    pipeStreamToLog(p.getErrorStream(), Level.WARNING);

    String sdkRoot = bufferOutput(p.getInputStream()).get(1, TimeUnit.MINUTES).trim();

    if (p.waitFor() != 0) {
      throw new RuntimeException("Failed to get sdk root, is gcloud sdk installed?");
    }
    return Paths.get(sdkRoot);
  }

  private static int getAvailablePort() {
    try (ServerSocket serverSocket = new ServerSocket(0)) {
      return serverSocket.getLocalPort();
    } catch (IOException e) {
      throw new RuntimeException("Failed to find open port");
    }
  }

  private void waitForPort(int port) throws InterruptedException, TimeoutException {
    for (int i = 0; i < 100; i++) {
      try (Socket ignored = new Socket("localhost", port)) {
        return;
      } catch (IOException e) {
        Thread.sleep(200);
      }
    }

    throw new TimeoutException("Timed out waiting for server to start");
  }

  private static void pipeStreamToLog(final InputStream stream, final Level level) {
    final BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

    Thread thread =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                try {
                  String line;
                  while ((line = reader.readLine()) != null) {
                    LOGGER.log(level, line);
                  }
                } catch (IOException e) {
                  LOGGER.log(Level.WARNING, "Failed to read process stream", e);
                }
              }
            });
    thread.setDaemon(true);
    thread.start();
  }

  private static Future<String> bufferOutput(final InputStream stream) {
    FutureTask<String> task =
        new FutureTask<>(
            new Callable<String>() {
              @Override
              public String call() throws Exception {
                return CharStreams.toString(new InputStreamReader(stream));
              }
            });
    task.run();

    return task;
  }
  // </editor-fold>
}
