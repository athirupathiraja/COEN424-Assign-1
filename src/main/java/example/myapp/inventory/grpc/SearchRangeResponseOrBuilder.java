// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inventory.proto

package example.myapp.inventory.grpc;

public interface SearchRangeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SearchRangeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .InventoryRecord records = 1;</code>
   */
  java.util.List<example.myapp.inventory.grpc.InventoryRecord> 
      getRecordsList();
  /**
   * <code>repeated .InventoryRecord records = 1;</code>
   */
  example.myapp.inventory.grpc.InventoryRecord getRecords(int index);
  /**
   * <code>repeated .InventoryRecord records = 1;</code>
   */
  int getRecordsCount();
  /**
   * <code>repeated .InventoryRecord records = 1;</code>
   */
  java.util.List<? extends example.myapp.inventory.grpc.InventoryRecordOrBuilder> 
      getRecordsOrBuilderList();
  /**
   * <code>repeated .InventoryRecord records = 1;</code>
   */
  example.myapp.inventory.grpc.InventoryRecordOrBuilder getRecordsOrBuilder(
      int index);
}
