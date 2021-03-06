// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/type.proto

package com.google.spanner.v1;

public interface TypeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.v1.Type)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The [TypeCode][google.spanner.v1.TypeCode] for this type.
   * </pre>
   *
   * <code>.google.spanner.v1.TypeCode code = 1;</code>
   */
  int getCodeValue();
  /**
   *
   *
   * <pre>
   * Required. The [TypeCode][google.spanner.v1.TypeCode] for this type.
   * </pre>
   *
   * <code>.google.spanner.v1.TypeCode code = 1;</code>
   */
  com.google.spanner.v1.TypeCode getCode();

  /**
   *
   *
   * <pre>
   * If [code][google.spanner.v1.Type.code] ==
   * [ARRAY][google.spanner.v1.TypeCode.ARRAY], then `array_element_type` is the
   * type of the array elements.
   * </pre>
   *
   * <code>.google.spanner.v1.Type array_element_type = 2;</code>
   */
  boolean hasArrayElementType();
  /**
   *
   *
   * <pre>
   * If [code][google.spanner.v1.Type.code] ==
   * [ARRAY][google.spanner.v1.TypeCode.ARRAY], then `array_element_type` is the
   * type of the array elements.
   * </pre>
   *
   * <code>.google.spanner.v1.Type array_element_type = 2;</code>
   */
  com.google.spanner.v1.Type getArrayElementType();
  /**
   *
   *
   * <pre>
   * If [code][google.spanner.v1.Type.code] ==
   * [ARRAY][google.spanner.v1.TypeCode.ARRAY], then `array_element_type` is the
   * type of the array elements.
   * </pre>
   *
   * <code>.google.spanner.v1.Type array_element_type = 2;</code>
   */
  com.google.spanner.v1.TypeOrBuilder getArrayElementTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * If [code][google.spanner.v1.Type.code] ==
   * [STRUCT][google.spanner.v1.TypeCode.STRUCT], then `struct_type` provides
   * type information for the struct's fields.
   * </pre>
   *
   * <code>.google.spanner.v1.StructType struct_type = 3;</code>
   */
  boolean hasStructType();
  /**
   *
   *
   * <pre>
   * If [code][google.spanner.v1.Type.code] ==
   * [STRUCT][google.spanner.v1.TypeCode.STRUCT], then `struct_type` provides
   * type information for the struct's fields.
   * </pre>
   *
   * <code>.google.spanner.v1.StructType struct_type = 3;</code>
   */
  com.google.spanner.v1.StructType getStructType();
  /**
   *
   *
   * <pre>
   * If [code][google.spanner.v1.Type.code] ==
   * [STRUCT][google.spanner.v1.TypeCode.STRUCT], then `struct_type` provides
   * type information for the struct's fields.
   * </pre>
   *
   * <code>.google.spanner.v1.StructType struct_type = 3;</code>
   */
  com.google.spanner.v1.StructTypeOrBuilder getStructTypeOrBuilder();
}
