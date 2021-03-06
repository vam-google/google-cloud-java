// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/event.proto

package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * An event issued when a profile searcher interacts with the application
 * that implements Cloud Talent Solution.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4beta1.ProfileEvent}
 */
public final class ProfileEvent extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4beta1.ProfileEvent)
    ProfileEventOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ProfileEvent.newBuilder() to construct.
  private ProfileEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ProfileEvent() {
    type_ = 0;
    profiles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    jobId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ProfileEvent(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8:
            {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                profiles_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              profiles_.add(s);
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              jobId_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        profiles_ = profiles_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.talent.v4beta1.EventProto
        .internal_static_google_cloud_talent_v4beta1_ProfileEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4beta1.EventProto
        .internal_static_google_cloud_talent_v4beta1_ProfileEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4beta1.ProfileEvent.class,
            com.google.cloud.talent.v4beta1.ProfileEvent.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The enum represents types of client events for a candidate profile.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType}
   */
  public enum ProfileEventType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default value.
     * </pre>
     *
     * <code>PROFILE_EVENT_TYPE_UNSPECIFIED = 0;</code>
     */
    PROFILE_EVENT_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The profile is displayed.
     * </pre>
     *
     * <code>IMPRESSION = 1;</code>
     */
    IMPRESSION(1),
    /**
     *
     *
     * <pre>
     * The profile is viewed.
     * </pre>
     *
     * <code>VIEW = 2;</code>
     */
    VIEW(2),
    /**
     *
     *
     * <pre>
     * The profile is bookmarked.
     * </pre>
     *
     * <code>BOOKMARK = 3;</code>
     */
    BOOKMARK(3),
    /**
     *
     *
     * <pre>
     * Comment added to the profile.
     * </pre>
     *
     * <code>COMMENT_ADDED = 4;</code>
     */
    COMMENT_ADDED(4),
    /**
     *
     *
     * <pre>
     * Email sent regarding the profile.
     * </pre>
     *
     * <code>EMAIL_SENT = 5;</code>
     */
    EMAIL_SENT(5),
    /**
     *
     *
     * <pre>
     * The resume of the profile is viewed.
     * </pre>
     *
     * <code>RESUME_VIEWED = 6;</code>
     */
    RESUME_VIEWED(6),
    /**
     *
     *
     * <pre>
     * The profile is added to a job.
     * </pre>
     *
     * <code>ADD_TO_JOB = 7;</code>
     */
    ADD_TO_JOB(7),
    /**
     *
     *
     * <pre>
     * The recruiter explicitly highlights that a given profile is interesting
     * enough for later review or is a good result for the search.
     * </pre>
     *
     * <code>POSITIVE_REACTION_TO_PROFILE = 8;</code>
     */
    POSITIVE_REACTION_TO_PROFILE(8),
    /**
     *
     *
     * <pre>
     * The recruiter explicitly highlights that a given profile is not
     * interesting enough for later review or is not a good result for the
     * search.
     * </pre>
     *
     * <code>NEGATIVE_REACTION_TO_PROFILE = 9;</code>
     */
    NEGATIVE_REACTION_TO_PROFILE(9),
    /**
     *
     *
     * <pre>
     * The candidate is interesting enough to set up an initial screen with the
     * recruiter. This step may be skipped based on the interview process.
     * </pre>
     *
     * <code>SCREEN = 10;</code>
     */
    SCREEN(10),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default value.
     * </pre>
     *
     * <code>PROFILE_EVENT_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int PROFILE_EVENT_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The profile is displayed.
     * </pre>
     *
     * <code>IMPRESSION = 1;</code>
     */
    public static final int IMPRESSION_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The profile is viewed.
     * </pre>
     *
     * <code>VIEW = 2;</code>
     */
    public static final int VIEW_VALUE = 2;
    /**
     *
     *
     * <pre>
     * The profile is bookmarked.
     * </pre>
     *
     * <code>BOOKMARK = 3;</code>
     */
    public static final int BOOKMARK_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Comment added to the profile.
     * </pre>
     *
     * <code>COMMENT_ADDED = 4;</code>
     */
    public static final int COMMENT_ADDED_VALUE = 4;
    /**
     *
     *
     * <pre>
     * Email sent regarding the profile.
     * </pre>
     *
     * <code>EMAIL_SENT = 5;</code>
     */
    public static final int EMAIL_SENT_VALUE = 5;
    /**
     *
     *
     * <pre>
     * The resume of the profile is viewed.
     * </pre>
     *
     * <code>RESUME_VIEWED = 6;</code>
     */
    public static final int RESUME_VIEWED_VALUE = 6;
    /**
     *
     *
     * <pre>
     * The profile is added to a job.
     * </pre>
     *
     * <code>ADD_TO_JOB = 7;</code>
     */
    public static final int ADD_TO_JOB_VALUE = 7;
    /**
     *
     *
     * <pre>
     * The recruiter explicitly highlights that a given profile is interesting
     * enough for later review or is a good result for the search.
     * </pre>
     *
     * <code>POSITIVE_REACTION_TO_PROFILE = 8;</code>
     */
    public static final int POSITIVE_REACTION_TO_PROFILE_VALUE = 8;
    /**
     *
     *
     * <pre>
     * The recruiter explicitly highlights that a given profile is not
     * interesting enough for later review or is not a good result for the
     * search.
     * </pre>
     *
     * <code>NEGATIVE_REACTION_TO_PROFILE = 9;</code>
     */
    public static final int NEGATIVE_REACTION_TO_PROFILE_VALUE = 9;
    /**
     *
     *
     * <pre>
     * The candidate is interesting enough to set up an initial screen with the
     * recruiter. This step may be skipped based on the interview process.
     * </pre>
     *
     * <code>SCREEN = 10;</code>
     */
    public static final int SCREEN_VALUE = 10;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static ProfileEventType valueOf(int value) {
      return forNumber(value);
    }

    public static ProfileEventType forNumber(int value) {
      switch (value) {
        case 0:
          return PROFILE_EVENT_TYPE_UNSPECIFIED;
        case 1:
          return IMPRESSION;
        case 2:
          return VIEW;
        case 3:
          return BOOKMARK;
        case 4:
          return COMMENT_ADDED;
        case 5:
          return EMAIL_SENT;
        case 6:
          return RESUME_VIEWED;
        case 7:
          return ADD_TO_JOB;
        case 8:
          return POSITIVE_REACTION_TO_PROFILE;
        case 9:
          return NEGATIVE_REACTION_TO_PROFILE;
        case 10:
          return SCREEN;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ProfileEventType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ProfileEventType>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ProfileEventType>() {
              public ProfileEventType findValueByNumber(int number) {
                return ProfileEventType.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.talent.v4beta1.ProfileEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final ProfileEventType[] VALUES = values();

    public static ProfileEventType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ProfileEventType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType)
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   *
   *
   * <pre>
   * Required.
   * Type of event.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType type = 1;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   *
   *
   * <pre>
   * Required.
   * Type of event.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType type = 1;</code>
   */
  public com.google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType getType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType result =
        com.google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType.valueOf(type_);
    return result == null
        ? com.google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType.UNRECOGNIZED
        : result;
  }

  public static final int PROFILES_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList profiles_;
  /**
   *
   *
   * <pre>
   * Required.
   * The [profile name(s)][google.cloud.talent.v4beta1.Profile.name] associated
   * with this client event.
   * </pre>
   *
   * <code>repeated string profiles = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList getProfilesList() {
    return profiles_;
  }
  /**
   *
   *
   * <pre>
   * Required.
   * The [profile name(s)][google.cloud.talent.v4beta1.Profile.name] associated
   * with this client event.
   * </pre>
   *
   * <code>repeated string profiles = 2;</code>
   */
  public int getProfilesCount() {
    return profiles_.size();
  }
  /**
   *
   *
   * <pre>
   * Required.
   * The [profile name(s)][google.cloud.talent.v4beta1.Profile.name] associated
   * with this client event.
   * </pre>
   *
   * <code>repeated string profiles = 2;</code>
   */
  public java.lang.String getProfiles(int index) {
    return profiles_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required.
   * The [profile name(s)][google.cloud.talent.v4beta1.Profile.name] associated
   * with this client event.
   * </pre>
   *
   * <code>repeated string profiles = 2;</code>
   */
  public com.google.protobuf.ByteString getProfilesBytes(int index) {
    return profiles_.getByteString(index);
  }

  public static final int JOB_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object jobId_;
  /**
   *
   *
   * <pre>
   * Optional.
   * The job ID associated with this client event if there is one. Leave it
   * empty if the event isn't associated with a job.
   * The job ID should be consistent with the
   * [JobApplication.job.requisition_id][] in the profile.
   * </pre>
   *
   * <code>string job_id = 3;</code>
   */
  public java.lang.String getJobId() {
    java.lang.Object ref = jobId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jobId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional.
   * The job ID associated with this client event if there is one. Leave it
   * empty if the event isn't associated with a job.
   * The job ID should be consistent with the
   * [JobApplication.job.requisition_id][] in the profile.
   * </pre>
   *
   * <code>string job_id = 3;</code>
   */
  public com.google.protobuf.ByteString getJobIdBytes() {
    java.lang.Object ref = jobId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      jobId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (type_
        != com.google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType
            .PROFILE_EVENT_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, type_);
    }
    for (int i = 0; i < profiles_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, profiles_.getRaw(i));
    }
    if (!getJobIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, jobId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_
        != com.google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType
            .PROFILE_EVENT_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, type_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < profiles_.size(); i++) {
        dataSize += computeStringSizeNoTag(profiles_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getProfilesList().size();
    }
    if (!getJobIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, jobId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.talent.v4beta1.ProfileEvent)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4beta1.ProfileEvent other =
        (com.google.cloud.talent.v4beta1.ProfileEvent) obj;

    boolean result = true;
    result = result && type_ == other.type_;
    result = result && getProfilesList().equals(other.getProfilesList());
    result = result && getJobId().equals(other.getJobId());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    if (getProfilesCount() > 0) {
      hash = (37 * hash) + PROFILES_FIELD_NUMBER;
      hash = (53 * hash) + getProfilesList().hashCode();
    }
    hash = (37 * hash) + JOB_ID_FIELD_NUMBER;
    hash = (53 * hash) + getJobId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4beta1.ProfileEvent parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.ProfileEvent parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ProfileEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.ProfileEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ProfileEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.ProfileEvent parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ProfileEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.ProfileEvent parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ProfileEvent parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.ProfileEvent parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ProfileEvent parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.ProfileEvent parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.talent.v4beta1.ProfileEvent prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * An event issued when a profile searcher interacts with the application
   * that implements Cloud Talent Solution.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4beta1.ProfileEvent}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4beta1.ProfileEvent)
      com.google.cloud.talent.v4beta1.ProfileEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.talent.v4beta1.EventProto
          .internal_static_google_cloud_talent_v4beta1_ProfileEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4beta1.EventProto
          .internal_static_google_cloud_talent_v4beta1_ProfileEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4beta1.ProfileEvent.class,
              com.google.cloud.talent.v4beta1.ProfileEvent.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4beta1.ProfileEvent.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = 0;

      profiles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      jobId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.talent.v4beta1.EventProto
          .internal_static_google_cloud_talent_v4beta1_ProfileEvent_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.ProfileEvent getDefaultInstanceForType() {
      return com.google.cloud.talent.v4beta1.ProfileEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.ProfileEvent build() {
      com.google.cloud.talent.v4beta1.ProfileEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.ProfileEvent buildPartial() {
      com.google.cloud.talent.v4beta1.ProfileEvent result =
          new com.google.cloud.talent.v4beta1.ProfileEvent(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.type_ = type_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        profiles_ = profiles_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.profiles_ = profiles_;
      result.jobId_ = jobId_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.talent.v4beta1.ProfileEvent) {
        return mergeFrom((com.google.cloud.talent.v4beta1.ProfileEvent) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4beta1.ProfileEvent other) {
      if (other == com.google.cloud.talent.v4beta1.ProfileEvent.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.profiles_.isEmpty()) {
        if (profiles_.isEmpty()) {
          profiles_ = other.profiles_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureProfilesIsMutable();
          profiles_.addAll(other.profiles_);
        }
        onChanged();
      }
      if (!other.getJobId().isEmpty()) {
        jobId_ = other.jobId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.talent.v4beta1.ProfileEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.talent.v4beta1.ProfileEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private int type_ = 0;
    /**
     *
     *
     * <pre>
     * Required.
     * Type of event.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * Type of event.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType type = 1;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * Type of event.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType type = 1;</code>
     */
    public com.google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType getType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType result =
          com.google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType.valueOf(type_);
      return result == null
          ? com.google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * Type of event.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType type = 1;</code>
     */
    public Builder setType(com.google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * Type of event.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType type = 1;</code>
     */
    public Builder clearType() {

      type_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList profiles_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureProfilesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        profiles_ = new com.google.protobuf.LazyStringArrayList(profiles_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The [profile name(s)][google.cloud.talent.v4beta1.Profile.name] associated
     * with this client event.
     * </pre>
     *
     * <code>repeated string profiles = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList getProfilesList() {
      return profiles_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The [profile name(s)][google.cloud.talent.v4beta1.Profile.name] associated
     * with this client event.
     * </pre>
     *
     * <code>repeated string profiles = 2;</code>
     */
    public int getProfilesCount() {
      return profiles_.size();
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The [profile name(s)][google.cloud.talent.v4beta1.Profile.name] associated
     * with this client event.
     * </pre>
     *
     * <code>repeated string profiles = 2;</code>
     */
    public java.lang.String getProfiles(int index) {
      return profiles_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The [profile name(s)][google.cloud.talent.v4beta1.Profile.name] associated
     * with this client event.
     * </pre>
     *
     * <code>repeated string profiles = 2;</code>
     */
    public com.google.protobuf.ByteString getProfilesBytes(int index) {
      return profiles_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The [profile name(s)][google.cloud.talent.v4beta1.Profile.name] associated
     * with this client event.
     * </pre>
     *
     * <code>repeated string profiles = 2;</code>
     */
    public Builder setProfiles(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureProfilesIsMutable();
      profiles_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The [profile name(s)][google.cloud.talent.v4beta1.Profile.name] associated
     * with this client event.
     * </pre>
     *
     * <code>repeated string profiles = 2;</code>
     */
    public Builder addProfiles(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureProfilesIsMutable();
      profiles_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The [profile name(s)][google.cloud.talent.v4beta1.Profile.name] associated
     * with this client event.
     * </pre>
     *
     * <code>repeated string profiles = 2;</code>
     */
    public Builder addAllProfiles(java.lang.Iterable<java.lang.String> values) {
      ensureProfilesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, profiles_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The [profile name(s)][google.cloud.talent.v4beta1.Profile.name] associated
     * with this client event.
     * </pre>
     *
     * <code>repeated string profiles = 2;</code>
     */
    public Builder clearProfiles() {
      profiles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The [profile name(s)][google.cloud.talent.v4beta1.Profile.name] associated
     * with this client event.
     * </pre>
     *
     * <code>repeated string profiles = 2;</code>
     */
    public Builder addProfilesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureProfilesIsMutable();
      profiles_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object jobId_ = "";
    /**
     *
     *
     * <pre>
     * Optional.
     * The job ID associated with this client event if there is one. Leave it
     * empty if the event isn't associated with a job.
     * The job ID should be consistent with the
     * [JobApplication.job.requisition_id][] in the profile.
     * </pre>
     *
     * <code>string job_id = 3;</code>
     */
    public java.lang.String getJobId() {
      java.lang.Object ref = jobId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jobId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional.
     * The job ID associated with this client event if there is one. Leave it
     * empty if the event isn't associated with a job.
     * The job ID should be consistent with the
     * [JobApplication.job.requisition_id][] in the profile.
     * </pre>
     *
     * <code>string job_id = 3;</code>
     */
    public com.google.protobuf.ByteString getJobIdBytes() {
      java.lang.Object ref = jobId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        jobId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional.
     * The job ID associated with this client event if there is one. Leave it
     * empty if the event isn't associated with a job.
     * The job ID should be consistent with the
     * [JobApplication.job.requisition_id][] in the profile.
     * </pre>
     *
     * <code>string job_id = 3;</code>
     */
    public Builder setJobId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      jobId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional.
     * The job ID associated with this client event if there is one. Leave it
     * empty if the event isn't associated with a job.
     * The job ID should be consistent with the
     * [JobApplication.job.requisition_id][] in the profile.
     * </pre>
     *
     * <code>string job_id = 3;</code>
     */
    public Builder clearJobId() {

      jobId_ = getDefaultInstance().getJobId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional.
     * The job ID associated with this client event if there is one. Leave it
     * empty if the event isn't associated with a job.
     * The job ID should be consistent with the
     * [JobApplication.job.requisition_id][] in the profile.
     * </pre>
     *
     * <code>string job_id = 3;</code>
     */
    public Builder setJobIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      jobId_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4beta1.ProfileEvent)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.ProfileEvent)
  private static final com.google.cloud.talent.v4beta1.ProfileEvent DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4beta1.ProfileEvent();
  }

  public static com.google.cloud.talent.v4beta1.ProfileEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProfileEvent> PARSER =
      new com.google.protobuf.AbstractParser<ProfileEvent>() {
        @java.lang.Override
        public ProfileEvent parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ProfileEvent(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ProfileEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProfileEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4beta1.ProfileEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
