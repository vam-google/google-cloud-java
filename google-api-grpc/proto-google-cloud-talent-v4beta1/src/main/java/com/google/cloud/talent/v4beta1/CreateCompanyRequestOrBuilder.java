// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/company_service.proto

package com.google.cloud.talent.v4beta1;

public interface CreateCompanyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.CreateCompanyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required.
   * Resource name of the project under which the company is created.
   * The format is "projects/{project_id}", for example,
   * "projects/api-test-project".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required.
   * Resource name of the project under which the company is created.
   * The format is "projects/{project_id}", for example,
   * "projects/api-test-project".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required.
   * The company to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Company company = 2;</code>
   */
  boolean hasCompany();
  /**
   *
   *
   * <pre>
   * Required.
   * The company to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Company company = 2;</code>
   */
  com.google.cloud.talent.v4beta1.Company getCompany();
  /**
   *
   *
   * <pre>
   * Required.
   * The company to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Company company = 2;</code>
   */
  com.google.cloud.talent.v4beta1.CompanyOrBuilder getCompanyOrBuilder();
}
