// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: etcd.proto

package com.xqbase.etcd4j;

public interface WatchRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcd4j.WatchRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .etcd4j.WatchCreateRequest create_request = 1;</code>
   */
  com.xqbase.etcd4j.WatchCreateRequest getCreateRequest();
  /**
   * <code>optional .etcd4j.WatchCreateRequest create_request = 1;</code>
   */
  com.xqbase.etcd4j.WatchCreateRequestOrBuilder getCreateRequestOrBuilder();

  /**
   * <code>optional .etcd4j.WatchCancelRequest cancel_request = 2;</code>
   */
  com.xqbase.etcd4j.WatchCancelRequest getCancelRequest();
  /**
   * <code>optional .etcd4j.WatchCancelRequest cancel_request = 2;</code>
   */
  com.xqbase.etcd4j.WatchCancelRequestOrBuilder getCancelRequestOrBuilder();

  public com.xqbase.etcd4j.WatchRequest.RequestUnionCase getRequestUnionCase();
}
