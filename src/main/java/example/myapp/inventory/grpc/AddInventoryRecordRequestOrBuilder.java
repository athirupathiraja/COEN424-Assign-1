// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inventory.proto

package example.myapp.inventory.grpc;

public interface AddInventoryRecordRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AddInventoryRecordRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string ID = 1;</code>
   */
  java.lang.String getID();
  /**
   * <code>string ID = 1;</code>
   */
  com.google.protobuf.ByteString
      getIDBytes();

  /**
   * <code>.InventoryRecord record = 2;</code>
   */
  boolean hasRecord();
  /**
   * <code>.InventoryRecord record = 2;</code>
   */
  example.myapp.inventory.grpc.InventoryRecord getRecord();
  /**
   * <code>.InventoryRecord record = 2;</code>
   */
  example.myapp.inventory.grpc.InventoryRecordOrBuilder getRecordOrBuilder();
}
