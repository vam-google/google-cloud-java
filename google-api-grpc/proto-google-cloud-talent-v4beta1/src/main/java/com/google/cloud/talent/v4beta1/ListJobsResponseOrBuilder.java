// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/job_service.proto

package com.google.cloud.talent.v4beta1;

public interface ListJobsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.ListJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Jobs for a given company.
   * The maximum number of items returned is based on the limit field
   * provided in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Job jobs = 1;</code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.Job> getJobsList();
  /**
   *
   *
   * <pre>
   * The Jobs for a given company.
   * The maximum number of items returned is based on the limit field
   * provided in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Job jobs = 1;</code>
   */
  com.google.cloud.talent.v4beta1.Job getJobs(int index);
  /**
   *
   *
   * <pre>
   * The Jobs for a given company.
   * The maximum number of items returned is based on the limit field
   * provided in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Job jobs = 1;</code>
   */
  int getJobsCount();
  /**
   *
   *
   * <pre>
   * The Jobs for a given company.
   * The maximum number of items returned is based on the limit field
   * provided in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Job jobs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.JobOrBuilder> getJobsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The Jobs for a given company.
   * The maximum number of items returned is based on the limit field
   * provided in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Job jobs = 1;</code>
   */
  com.google.cloud.talent.v4beta1.JobOrBuilder getJobsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Additional information for the API invocation, such as the request
   * tracking id.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ResponseMetadata metadata = 3;</code>
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * Additional information for the API invocation, such as the request
   * tracking id.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ResponseMetadata metadata = 3;</code>
   */
  com.google.cloud.talent.v4beta1.ResponseMetadata getMetadata();
  /**
   *
   *
   * <pre>
   * Additional information for the API invocation, such as the request
   * tracking id.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ResponseMetadata metadata = 3;</code>
   */
  com.google.cloud.talent.v4beta1.ResponseMetadataOrBuilder getMetadataOrBuilder();
}