// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: etcd.proto

package com.xqbase.etcd4j;

/**
 * Protobuf type {@code etcd4j.RangeRequest}
 */
public  final class RangeRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:etcd4j.RangeRequest)
    RangeRequestOrBuilder {
  // Use RangeRequest.newBuilder() to construct.
  private RangeRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private RangeRequest() {
    key_ = com.google.protobuf.ByteString.EMPTY;
    rangeEnd_ = com.google.protobuf.ByteString.EMPTY;
    limit_ = 0L;
    revision_ = 0L;
    sortOrder_ = 0;
    sortTarget_ = 0;
    serializable_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RangeRequest(
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
          case 10: {

            key_ = input.readBytes();
            break;
          }
          case 18: {

            rangeEnd_ = input.readBytes();
            break;
          }
          case 24: {

            limit_ = input.readInt64();
            break;
          }
          case 32: {

            revision_ = input.readInt64();
            break;
          }
          case 40: {
            int rawValue = input.readEnum();

            sortOrder_ = rawValue;
            break;
          }
          case 48: {
            int rawValue = input.readEnum();

            sortTarget_ = rawValue;
            break;
          }
          case 56: {

            serializable_ = input.readBool();
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
    return com.xqbase.etcd4j.EtcdJavaProto.internal_static_etcd4j_RangeRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xqbase.etcd4j.EtcdJavaProto.internal_static_etcd4j_RangeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xqbase.etcd4j.RangeRequest.class, com.xqbase.etcd4j.RangeRequest.Builder.class);
  }

  /**
   * Protobuf enum {@code etcd4j.RangeRequest.SortOrder}
   */
  public enum SortOrder
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NONE = 0;</code>
     *
     * <pre>
     * default, no sorting
     * </pre>
     */
    NONE(0, 0),
    /**
     * <code>ASCEND = 1;</code>
     *
     * <pre>
     * lowest target value first
     * </pre>
     */
    ASCEND(1, 1),
    /**
     * <code>DESCEND = 2;</code>
     *
     * <pre>
     * highest target value first
     * </pre>
     */
    DESCEND(2, 2),
    UNRECOGNIZED(-1, -1),
    ;

    /**
     * <code>NONE = 0;</code>
     *
     * <pre>
     * default, no sorting
     * </pre>
     */
    public static final int NONE_VALUE = 0;
    /**
     * <code>ASCEND = 1;</code>
     *
     * <pre>
     * lowest target value first
     * </pre>
     */
    public static final int ASCEND_VALUE = 1;
    /**
     * <code>DESCEND = 2;</code>
     *
     * <pre>
     * highest target value first
     * </pre>
     */
    public static final int DESCEND_VALUE = 2;


    public final int getNumber() {
      if (index == -1) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    public static SortOrder valueOf(int value) {
      switch (value) {
        case 0: return NONE;
        case 1: return ASCEND;
        case 2: return DESCEND;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SortOrder>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SortOrder> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SortOrder>() {
            public SortOrder findValueByNumber(int number) {
              return SortOrder.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.xqbase.etcd4j.RangeRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final SortOrder[] VALUES = values();

    public static SortOrder valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private SortOrder(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:etcd4j.RangeRequest.SortOrder)
  }

  /**
   * Protobuf enum {@code etcd4j.RangeRequest.SortTarget}
   */
  public enum SortTarget
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>KEY = 0;</code>
     */
    KEY(0, 0),
    /**
     * <code>VERSION = 1;</code>
     */
    VERSION(1, 1),
    /**
     * <code>CREATE = 2;</code>
     */
    CREATE(2, 2),
    /**
     * <code>MOD = 3;</code>
     */
    MOD(3, 3),
    /**
     * <code>VALUE = 4;</code>
     */
    VALUE(4, 4),
    UNRECOGNIZED(-1, -1),
    ;

    /**
     * <code>KEY = 0;</code>
     */
    public static final int KEY_VALUE = 0;
    /**
     * <code>VERSION = 1;</code>
     */
    public static final int VERSION_VALUE = 1;
    /**
     * <code>CREATE = 2;</code>
     */
    public static final int CREATE_VALUE = 2;
    /**
     * <code>MOD = 3;</code>
     */
    public static final int MOD_VALUE = 3;
    /**
     * <code>VALUE = 4;</code>
     */
    public static final int VALUE_VALUE = 4;


    public final int getNumber() {
      if (index == -1) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    public static SortTarget valueOf(int value) {
      switch (value) {
        case 0: return KEY;
        case 1: return VERSION;
        case 2: return CREATE;
        case 3: return MOD;
        case 4: return VALUE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SortTarget>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SortTarget> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SortTarget>() {
            public SortTarget findValueByNumber(int number) {
              return SortTarget.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.xqbase.etcd4j.RangeRequest.getDescriptor().getEnumTypes().get(1);
    }

    private static final SortTarget[] VALUES = values();

    public static SortTarget valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private SortTarget(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:etcd4j.RangeRequest.SortTarget)
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString key_;
  /**
   * <code>optional bytes key = 1;</code>
   *
   * <pre>
   * if the range_end is not given, the request returns the key.
   * </pre>
   */
  public com.google.protobuf.ByteString getKey() {
    return key_;
  }

  public static final int RANGE_END_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString rangeEnd_;
  /**
   * <code>optional bytes range_end = 2;</code>
   *
   * <pre>
   * if the range_end is given, it gets the keys in range [key, range_end)
   * if range_end is nonempty, otherwise it returns all keys &gt;= key.
   * </pre>
   */
  public com.google.protobuf.ByteString getRangeEnd() {
    return rangeEnd_;
  }

  public static final int LIMIT_FIELD_NUMBER = 3;
  private long limit_;
  /**
   * <code>optional int64 limit = 3;</code>
   *
   * <pre>
   * limit the number of keys returned.
   * </pre>
   */
  public long getLimit() {
    return limit_;
  }

  public static final int REVISION_FIELD_NUMBER = 4;
  private long revision_;
  /**
   * <code>optional int64 revision = 4;</code>
   *
   * <pre>
   * range over the store at the given revision.
   * if revision is less or equal to zero, range over the newest store.
   * if the revision has been compacted, ErrCompaction will be returned in
   * response.
   * </pre>
   */
  public long getRevision() {
    return revision_;
  }

  public static final int SORT_ORDER_FIELD_NUMBER = 5;
  private int sortOrder_;
  /**
   * <code>optional .etcd4j.RangeRequest.SortOrder sort_order = 5;</code>
   *
   * <pre>
   * sort_order is the requested order for returned the results
   * </pre>
   */
  public int getSortOrderValue() {
    return sortOrder_;
  }
  /**
   * <code>optional .etcd4j.RangeRequest.SortOrder sort_order = 5;</code>
   *
   * <pre>
   * sort_order is the requested order for returned the results
   * </pre>
   */
  public com.xqbase.etcd4j.RangeRequest.SortOrder getSortOrder() {
    com.xqbase.etcd4j.RangeRequest.SortOrder result = com.xqbase.etcd4j.RangeRequest.SortOrder.valueOf(sortOrder_);
    return result == null ? com.xqbase.etcd4j.RangeRequest.SortOrder.UNRECOGNIZED : result;
  }

  public static final int SORT_TARGET_FIELD_NUMBER = 6;
  private int sortTarget_;
  /**
   * <code>optional .etcd4j.RangeRequest.SortTarget sort_target = 6;</code>
   *
   * <pre>
   * sort_target is the kv field to use for sorting
   * </pre>
   */
  public int getSortTargetValue() {
    return sortTarget_;
  }
  /**
   * <code>optional .etcd4j.RangeRequest.SortTarget sort_target = 6;</code>
   *
   * <pre>
   * sort_target is the kv field to use for sorting
   * </pre>
   */
  public com.xqbase.etcd4j.RangeRequest.SortTarget getSortTarget() {
    com.xqbase.etcd4j.RangeRequest.SortTarget result = com.xqbase.etcd4j.RangeRequest.SortTarget.valueOf(sortTarget_);
    return result == null ? com.xqbase.etcd4j.RangeRequest.SortTarget.UNRECOGNIZED : result;
  }

  public static final int SERIALIZABLE_FIELD_NUMBER = 7;
  private boolean serializable_;
  /**
   * <code>optional bool serializable = 7;</code>
   *
   * <pre>
   * range request is linearizable by default. Linearizable requests has a higher
   * latency and lower throughput than serializable request.
   * To reduce latency, serializable can be set. If serializable is set, range request
   * will be serializable, but not linearizable with other requests.
   * Serializable range can be served locally without waiting for other nodes in the cluster.
   * </pre>
   */
  public boolean getSerializable() {
    return serializable_;
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
    if (!key_.isEmpty()) {
      output.writeBytes(1, key_);
    }
    if (!rangeEnd_.isEmpty()) {
      output.writeBytes(2, rangeEnd_);
    }
    if (limit_ != 0L) {
      output.writeInt64(3, limit_);
    }
    if (revision_ != 0L) {
      output.writeInt64(4, revision_);
    }
    if (sortOrder_ != com.xqbase.etcd4j.RangeRequest.SortOrder.NONE.getNumber()) {
      output.writeEnum(5, sortOrder_);
    }
    if (sortTarget_ != com.xqbase.etcd4j.RangeRequest.SortTarget.KEY.getNumber()) {
      output.writeEnum(6, sortTarget_);
    }
    if (serializable_ != false) {
      output.writeBool(7, serializable_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!key_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, key_);
    }
    if (!rangeEnd_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, rangeEnd_);
    }
    if (limit_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, limit_);
    }
    if (revision_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, revision_);
    }
    if (sortOrder_ != com.xqbase.etcd4j.RangeRequest.SortOrder.NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, sortOrder_);
    }
    if (sortTarget_ != com.xqbase.etcd4j.RangeRequest.SortTarget.KEY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, sortTarget_);
    }
    if (serializable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, serializable_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.xqbase.etcd4j.RangeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xqbase.etcd4j.RangeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xqbase.etcd4j.RangeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xqbase.etcd4j.RangeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xqbase.etcd4j.RangeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.xqbase.etcd4j.RangeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.xqbase.etcd4j.RangeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.xqbase.etcd4j.RangeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.xqbase.etcd4j.RangeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.xqbase.etcd4j.RangeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.xqbase.etcd4j.RangeRequest prototype) {
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
   * Protobuf type {@code etcd4j.RangeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcd4j.RangeRequest)
      com.xqbase.etcd4j.RangeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xqbase.etcd4j.EtcdJavaProto.internal_static_etcd4j_RangeRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xqbase.etcd4j.EtcdJavaProto.internal_static_etcd4j_RangeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xqbase.etcd4j.RangeRequest.class, com.xqbase.etcd4j.RangeRequest.Builder.class);
    }

    // Construct using com.xqbase.etcd4j.RangeRequest.newBuilder()
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
      key_ = com.google.protobuf.ByteString.EMPTY;

      rangeEnd_ = com.google.protobuf.ByteString.EMPTY;

      limit_ = 0L;

      revision_ = 0L;

      sortOrder_ = 0;

      sortTarget_ = 0;

      serializable_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xqbase.etcd4j.EtcdJavaProto.internal_static_etcd4j_RangeRequest_descriptor;
    }

    public com.xqbase.etcd4j.RangeRequest getDefaultInstanceForType() {
      return com.xqbase.etcd4j.RangeRequest.getDefaultInstance();
    }

    public com.xqbase.etcd4j.RangeRequest build() {
      com.xqbase.etcd4j.RangeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.xqbase.etcd4j.RangeRequest buildPartial() {
      com.xqbase.etcd4j.RangeRequest result = new com.xqbase.etcd4j.RangeRequest(this);
      result.key_ = key_;
      result.rangeEnd_ = rangeEnd_;
      result.limit_ = limit_;
      result.revision_ = revision_;
      result.sortOrder_ = sortOrder_;
      result.sortTarget_ = sortTarget_;
      result.serializable_ = serializable_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.xqbase.etcd4j.RangeRequest) {
        return mergeFrom((com.xqbase.etcd4j.RangeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xqbase.etcd4j.RangeRequest other) {
      if (other == com.xqbase.etcd4j.RangeRequest.getDefaultInstance()) return this;
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
      }
      if (other.getRangeEnd() != com.google.protobuf.ByteString.EMPTY) {
        setRangeEnd(other.getRangeEnd());
      }
      if (other.getLimit() != 0L) {
        setLimit(other.getLimit());
      }
      if (other.getRevision() != 0L) {
        setRevision(other.getRevision());
      }
      if (other.sortOrder_ != 0) {
        setSortOrderValue(other.getSortOrderValue());
      }
      if (other.sortTarget_ != 0) {
        setSortTargetValue(other.getSortTargetValue());
      }
      if (other.getSerializable() != false) {
        setSerializable(other.getSerializable());
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
      com.xqbase.etcd4j.RangeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xqbase.etcd4j.RangeRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes key = 1;</code>
     *
     * <pre>
     * if the range_end is not given, the request returns the key.
     * </pre>
     */
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }
    /**
     * <code>optional bytes key = 1;</code>
     *
     * <pre>
     * if the range_end is not given, the request returns the key.
     * </pre>
     */
    public Builder setKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes key = 1;</code>
     *
     * <pre>
     * if the range_end is not given, the request returns the key.
     * </pre>
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString rangeEnd_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes range_end = 2;</code>
     *
     * <pre>
     * if the range_end is given, it gets the keys in range [key, range_end)
     * if range_end is nonempty, otherwise it returns all keys &gt;= key.
     * </pre>
     */
    public com.google.protobuf.ByteString getRangeEnd() {
      return rangeEnd_;
    }
    /**
     * <code>optional bytes range_end = 2;</code>
     *
     * <pre>
     * if the range_end is given, it gets the keys in range [key, range_end)
     * if range_end is nonempty, otherwise it returns all keys &gt;= key.
     * </pre>
     */
    public Builder setRangeEnd(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rangeEnd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes range_end = 2;</code>
     *
     * <pre>
     * if the range_end is given, it gets the keys in range [key, range_end)
     * if range_end is nonempty, otherwise it returns all keys &gt;= key.
     * </pre>
     */
    public Builder clearRangeEnd() {
      
      rangeEnd_ = getDefaultInstance().getRangeEnd();
      onChanged();
      return this;
    }

    private long limit_ ;
    /**
     * <code>optional int64 limit = 3;</code>
     *
     * <pre>
     * limit the number of keys returned.
     * </pre>
     */
    public long getLimit() {
      return limit_;
    }
    /**
     * <code>optional int64 limit = 3;</code>
     *
     * <pre>
     * limit the number of keys returned.
     * </pre>
     */
    public Builder setLimit(long value) {
      
      limit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 limit = 3;</code>
     *
     * <pre>
     * limit the number of keys returned.
     * </pre>
     */
    public Builder clearLimit() {
      
      limit_ = 0L;
      onChanged();
      return this;
    }

    private long revision_ ;
    /**
     * <code>optional int64 revision = 4;</code>
     *
     * <pre>
     * range over the store at the given revision.
     * if revision is less or equal to zero, range over the newest store.
     * if the revision has been compacted, ErrCompaction will be returned in
     * response.
     * </pre>
     */
    public long getRevision() {
      return revision_;
    }
    /**
     * <code>optional int64 revision = 4;</code>
     *
     * <pre>
     * range over the store at the given revision.
     * if revision is less or equal to zero, range over the newest store.
     * if the revision has been compacted, ErrCompaction will be returned in
     * response.
     * </pre>
     */
    public Builder setRevision(long value) {
      
      revision_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 revision = 4;</code>
     *
     * <pre>
     * range over the store at the given revision.
     * if revision is less or equal to zero, range over the newest store.
     * if the revision has been compacted, ErrCompaction will be returned in
     * response.
     * </pre>
     */
    public Builder clearRevision() {
      
      revision_ = 0L;
      onChanged();
      return this;
    }

    private int sortOrder_ = 0;
    /**
     * <code>optional .etcd4j.RangeRequest.SortOrder sort_order = 5;</code>
     *
     * <pre>
     * sort_order is the requested order for returned the results
     * </pre>
     */
    public int getSortOrderValue() {
      return sortOrder_;
    }
    /**
     * <code>optional .etcd4j.RangeRequest.SortOrder sort_order = 5;</code>
     *
     * <pre>
     * sort_order is the requested order for returned the results
     * </pre>
     */
    public Builder setSortOrderValue(int value) {
      sortOrder_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .etcd4j.RangeRequest.SortOrder sort_order = 5;</code>
     *
     * <pre>
     * sort_order is the requested order for returned the results
     * </pre>
     */
    public com.xqbase.etcd4j.RangeRequest.SortOrder getSortOrder() {
      com.xqbase.etcd4j.RangeRequest.SortOrder result = com.xqbase.etcd4j.RangeRequest.SortOrder.valueOf(sortOrder_);
      return result == null ? com.xqbase.etcd4j.RangeRequest.SortOrder.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .etcd4j.RangeRequest.SortOrder sort_order = 5;</code>
     *
     * <pre>
     * sort_order is the requested order for returned the results
     * </pre>
     */
    public Builder setSortOrder(com.xqbase.etcd4j.RangeRequest.SortOrder value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      sortOrder_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .etcd4j.RangeRequest.SortOrder sort_order = 5;</code>
     *
     * <pre>
     * sort_order is the requested order for returned the results
     * </pre>
     */
    public Builder clearSortOrder() {
      
      sortOrder_ = 0;
      onChanged();
      return this;
    }

    private int sortTarget_ = 0;
    /**
     * <code>optional .etcd4j.RangeRequest.SortTarget sort_target = 6;</code>
     *
     * <pre>
     * sort_target is the kv field to use for sorting
     * </pre>
     */
    public int getSortTargetValue() {
      return sortTarget_;
    }
    /**
     * <code>optional .etcd4j.RangeRequest.SortTarget sort_target = 6;</code>
     *
     * <pre>
     * sort_target is the kv field to use for sorting
     * </pre>
     */
    public Builder setSortTargetValue(int value) {
      sortTarget_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .etcd4j.RangeRequest.SortTarget sort_target = 6;</code>
     *
     * <pre>
     * sort_target is the kv field to use for sorting
     * </pre>
     */
    public com.xqbase.etcd4j.RangeRequest.SortTarget getSortTarget() {
      com.xqbase.etcd4j.RangeRequest.SortTarget result = com.xqbase.etcd4j.RangeRequest.SortTarget.valueOf(sortTarget_);
      return result == null ? com.xqbase.etcd4j.RangeRequest.SortTarget.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .etcd4j.RangeRequest.SortTarget sort_target = 6;</code>
     *
     * <pre>
     * sort_target is the kv field to use for sorting
     * </pre>
     */
    public Builder setSortTarget(com.xqbase.etcd4j.RangeRequest.SortTarget value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      sortTarget_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .etcd4j.RangeRequest.SortTarget sort_target = 6;</code>
     *
     * <pre>
     * sort_target is the kv field to use for sorting
     * </pre>
     */
    public Builder clearSortTarget() {
      
      sortTarget_ = 0;
      onChanged();
      return this;
    }

    private boolean serializable_ ;
    /**
     * <code>optional bool serializable = 7;</code>
     *
     * <pre>
     * range request is linearizable by default. Linearizable requests has a higher
     * latency and lower throughput than serializable request.
     * To reduce latency, serializable can be set. If serializable is set, range request
     * will be serializable, but not linearizable with other requests.
     * Serializable range can be served locally without waiting for other nodes in the cluster.
     * </pre>
     */
    public boolean getSerializable() {
      return serializable_;
    }
    /**
     * <code>optional bool serializable = 7;</code>
     *
     * <pre>
     * range request is linearizable by default. Linearizable requests has a higher
     * latency and lower throughput than serializable request.
     * To reduce latency, serializable can be set. If serializable is set, range request
     * will be serializable, but not linearizable with other requests.
     * Serializable range can be served locally without waiting for other nodes in the cluster.
     * </pre>
     */
    public Builder setSerializable(boolean value) {
      
      serializable_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool serializable = 7;</code>
     *
     * <pre>
     * range request is linearizable by default. Linearizable requests has a higher
     * latency and lower throughput than serializable request.
     * To reduce latency, serializable can be set. If serializable is set, range request
     * will be serializable, but not linearizable with other requests.
     * Serializable range can be served locally without waiting for other nodes in the cluster.
     * </pre>
     */
    public Builder clearSerializable() {
      
      serializable_ = false;
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


    // @@protoc_insertion_point(builder_scope:etcd4j.RangeRequest)
  }

  // @@protoc_insertion_point(class_scope:etcd4j.RangeRequest)
  private static final com.xqbase.etcd4j.RangeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xqbase.etcd4j.RangeRequest();
  }

  public static com.xqbase.etcd4j.RangeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RangeRequest>
      PARSER = new com.google.protobuf.AbstractParser<RangeRequest>() {
    public RangeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new RangeRequest(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<RangeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RangeRequest> getParserForType() {
    return PARSER;
  }

  public com.xqbase.etcd4j.RangeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

