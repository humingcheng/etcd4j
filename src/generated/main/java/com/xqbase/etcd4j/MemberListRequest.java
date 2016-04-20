// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: etcd.proto

package com.xqbase.etcd4j;

/**
 * Protobuf type {@code etcd4j.MemberListRequest}
 */
public  final class MemberListRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:etcd4j.MemberListRequest)
    MemberListRequestOrBuilder {
  // Use MemberListRequest.newBuilder() to construct.
  private MemberListRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private MemberListRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MemberListRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
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
    return com.xqbase.etcd4j.EtcdJavaProto.internal_static_etcd4j_MemberListRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xqbase.etcd4j.EtcdJavaProto.internal_static_etcd4j_MemberListRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xqbase.etcd4j.MemberListRequest.class, com.xqbase.etcd4j.MemberListRequest.Builder.class);
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
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.xqbase.etcd4j.MemberListRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xqbase.etcd4j.MemberListRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xqbase.etcd4j.MemberListRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xqbase.etcd4j.MemberListRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xqbase.etcd4j.MemberListRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.xqbase.etcd4j.MemberListRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.xqbase.etcd4j.MemberListRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.xqbase.etcd4j.MemberListRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.xqbase.etcd4j.MemberListRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.xqbase.etcd4j.MemberListRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.xqbase.etcd4j.MemberListRequest prototype) {
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
   * Protobuf type {@code etcd4j.MemberListRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcd4j.MemberListRequest)
      com.xqbase.etcd4j.MemberListRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xqbase.etcd4j.EtcdJavaProto.internal_static_etcd4j_MemberListRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xqbase.etcd4j.EtcdJavaProto.internal_static_etcd4j_MemberListRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xqbase.etcd4j.MemberListRequest.class, com.xqbase.etcd4j.MemberListRequest.Builder.class);
    }

    // Construct using com.xqbase.etcd4j.MemberListRequest.newBuilder()
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
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xqbase.etcd4j.EtcdJavaProto.internal_static_etcd4j_MemberListRequest_descriptor;
    }

    public com.xqbase.etcd4j.MemberListRequest getDefaultInstanceForType() {
      return com.xqbase.etcd4j.MemberListRequest.getDefaultInstance();
    }

    public com.xqbase.etcd4j.MemberListRequest build() {
      com.xqbase.etcd4j.MemberListRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.xqbase.etcd4j.MemberListRequest buildPartial() {
      com.xqbase.etcd4j.MemberListRequest result = new com.xqbase.etcd4j.MemberListRequest(this);
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.xqbase.etcd4j.MemberListRequest) {
        return mergeFrom((com.xqbase.etcd4j.MemberListRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xqbase.etcd4j.MemberListRequest other) {
      if (other == com.xqbase.etcd4j.MemberListRequest.getDefaultInstance()) return this;
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
      com.xqbase.etcd4j.MemberListRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xqbase.etcd4j.MemberListRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:etcd4j.MemberListRequest)
  }

  // @@protoc_insertion_point(class_scope:etcd4j.MemberListRequest)
  private static final com.xqbase.etcd4j.MemberListRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xqbase.etcd4j.MemberListRequest();
  }

  public static com.xqbase.etcd4j.MemberListRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MemberListRequest>
      PARSER = new com.google.protobuf.AbstractParser<MemberListRequest>() {
    public MemberListRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new MemberListRequest(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<MemberListRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MemberListRequest> getParserForType() {
    return PARSER;
  }

  public com.xqbase.etcd4j.MemberListRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

