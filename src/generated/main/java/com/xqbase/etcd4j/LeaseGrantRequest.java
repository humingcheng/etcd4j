// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: etcd.proto

package com.xqbase.etcd4j;

/**
 * Protobuf type {@code etcd4j.LeaseGrantRequest}
 */
public  final class LeaseGrantRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:etcd4j.LeaseGrantRequest)
    LeaseGrantRequestOrBuilder {
  // Use LeaseGrantRequest.newBuilder() to construct.
  private LeaseGrantRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private LeaseGrantRequest() {
    tTL_ = 0L;
    iD_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private LeaseGrantRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            tTL_ = input.readInt64();
            break;
          }
          case 16: {

            iD_ = input.readInt64();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.xqbase.etcd4j.EtcdJavaProto.internal_static_etcd4j_LeaseGrantRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xqbase.etcd4j.EtcdJavaProto.internal_static_etcd4j_LeaseGrantRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xqbase.etcd4j.LeaseGrantRequest.class, com.xqbase.etcd4j.LeaseGrantRequest.Builder.class);
  }

  public static final int TTL_FIELD_NUMBER = 1;
  private long tTL_;
  /**
   * <code>optional int64 TTL = 1;</code>
   *
   * <pre>
   * advisory ttl in seconds
   * </pre>
   */
  public long getTTL() {
    return tTL_;
  }

  public static final int ID_FIELD_NUMBER = 2;
  private long iD_;
  /**
   * <code>optional int64 ID = 2;</code>
   *
   * <pre>
   * requested ID to create; 0 lets lessor choose
   * </pre>
   */
  public long getID() {
    return iD_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (tTL_ != 0L) {
      output.writeInt64(1, tTL_);
    }
    if (iD_ != 0L) {
      output.writeInt64(2, iD_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tTL_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, tTL_);
    }
    if (iD_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, iD_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.xqbase.etcd4j.LeaseGrantRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xqbase.etcd4j.LeaseGrantRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xqbase.etcd4j.LeaseGrantRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xqbase.etcd4j.LeaseGrantRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xqbase.etcd4j.LeaseGrantRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.xqbase.etcd4j.LeaseGrantRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.xqbase.etcd4j.LeaseGrantRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.xqbase.etcd4j.LeaseGrantRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.xqbase.etcd4j.LeaseGrantRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.xqbase.etcd4j.LeaseGrantRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.xqbase.etcd4j.LeaseGrantRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code etcd4j.LeaseGrantRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcd4j.LeaseGrantRequest)
      com.xqbase.etcd4j.LeaseGrantRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xqbase.etcd4j.EtcdJavaProto.internal_static_etcd4j_LeaseGrantRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xqbase.etcd4j.EtcdJavaProto.internal_static_etcd4j_LeaseGrantRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xqbase.etcd4j.LeaseGrantRequest.class, com.xqbase.etcd4j.LeaseGrantRequest.Builder.class);
    }

    // Construct using com.xqbase.etcd4j.LeaseGrantRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      tTL_ = 0L;

      iD_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xqbase.etcd4j.EtcdJavaProto.internal_static_etcd4j_LeaseGrantRequest_descriptor;
    }

    public com.xqbase.etcd4j.LeaseGrantRequest getDefaultInstanceForType() {
      return com.xqbase.etcd4j.LeaseGrantRequest.getDefaultInstance();
    }

    public com.xqbase.etcd4j.LeaseGrantRequest build() {
      com.xqbase.etcd4j.LeaseGrantRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.xqbase.etcd4j.LeaseGrantRequest buildPartial() {
      com.xqbase.etcd4j.LeaseGrantRequest result = new com.xqbase.etcd4j.LeaseGrantRequest(this);
      result.tTL_ = tTL_;
      result.iD_ = iD_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.xqbase.etcd4j.LeaseGrantRequest) {
        return mergeFrom((com.xqbase.etcd4j.LeaseGrantRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xqbase.etcd4j.LeaseGrantRequest other) {
      if (other == com.xqbase.etcd4j.LeaseGrantRequest.getDefaultInstance()) return this;
      if (other.getTTL() != 0L) {
        setTTL(other.getTTL());
      }
      if (other.getID() != 0L) {
        setID(other.getID());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.xqbase.etcd4j.LeaseGrantRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xqbase.etcd4j.LeaseGrantRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long tTL_ ;
    /**
     * <code>optional int64 TTL = 1;</code>
     *
     * <pre>
     * advisory ttl in seconds
     * </pre>
     */
    public long getTTL() {
      return tTL_;
    }
    /**
     * <code>optional int64 TTL = 1;</code>
     *
     * <pre>
     * advisory ttl in seconds
     * </pre>
     */
    public Builder setTTL(long value) {
      
      tTL_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 TTL = 1;</code>
     *
     * <pre>
     * advisory ttl in seconds
     * </pre>
     */
    public Builder clearTTL() {
      
      tTL_ = 0L;
      onChanged();
      return this;
    }

    private long iD_ ;
    /**
     * <code>optional int64 ID = 2;</code>
     *
     * <pre>
     * requested ID to create; 0 lets lessor choose
     * </pre>
     */
    public long getID() {
      return iD_;
    }
    /**
     * <code>optional int64 ID = 2;</code>
     *
     * <pre>
     * requested ID to create; 0 lets lessor choose
     * </pre>
     */
    public Builder setID(long value) {
      
      iD_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 ID = 2;</code>
     *
     * <pre>
     * requested ID to create; 0 lets lessor choose
     * </pre>
     */
    public Builder clearID() {
      
      iD_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:etcd4j.LeaseGrantRequest)
  }

  // @@protoc_insertion_point(class_scope:etcd4j.LeaseGrantRequest)
  private static final com.xqbase.etcd4j.LeaseGrantRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xqbase.etcd4j.LeaseGrantRequest();
  }

  public static com.xqbase.etcd4j.LeaseGrantRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LeaseGrantRequest>
      PARSER = new com.google.protobuf.AbstractParser<LeaseGrantRequest>() {
    public LeaseGrantRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new LeaseGrantRequest(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<LeaseGrantRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LeaseGrantRequest> getParserForType() {
    return PARSER;
  }

  public com.xqbase.etcd4j.LeaseGrantRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

