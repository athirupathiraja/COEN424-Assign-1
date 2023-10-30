package example.myapp.inventory.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: inventory.proto")
public final class InventoryServiceGrpc {

  private InventoryServiceGrpc() {}

  public static final String SERVICE_NAME = "InventoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<example.myapp.inventory.grpc.AddInventoryRecordRequest,
      com.google.protobuf.Empty> getAddInventoryRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddInventoryRecord",
      requestType = example.myapp.inventory.grpc.AddInventoryRecordRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.myapp.inventory.grpc.AddInventoryRecordRequest,
      com.google.protobuf.Empty> getAddInventoryRecordMethod() {
    io.grpc.MethodDescriptor<example.myapp.inventory.grpc.AddInventoryRecordRequest, com.google.protobuf.Empty> getAddInventoryRecordMethod;
    if ((getAddInventoryRecordMethod = InventoryServiceGrpc.getAddInventoryRecordMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getAddInventoryRecordMethod = InventoryServiceGrpc.getAddInventoryRecordMethod) == null) {
          InventoryServiceGrpc.getAddInventoryRecordMethod = getAddInventoryRecordMethod = 
              io.grpc.MethodDescriptor.<example.myapp.inventory.grpc.AddInventoryRecordRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InventoryService", "AddInventoryRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.myapp.inventory.grpc.AddInventoryRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("AddInventoryRecord"))
                  .build();
          }
        }
     }
     return getAddInventoryRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<example.myapp.inventory.grpc.UpdateInventoryAttributeRequest,
      com.google.protobuf.Empty> getUpdateInventoryAttributeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateInventoryAttribute",
      requestType = example.myapp.inventory.grpc.UpdateInventoryAttributeRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.myapp.inventory.grpc.UpdateInventoryAttributeRequest,
      com.google.protobuf.Empty> getUpdateInventoryAttributeMethod() {
    io.grpc.MethodDescriptor<example.myapp.inventory.grpc.UpdateInventoryAttributeRequest, com.google.protobuf.Empty> getUpdateInventoryAttributeMethod;
    if ((getUpdateInventoryAttributeMethod = InventoryServiceGrpc.getUpdateInventoryAttributeMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getUpdateInventoryAttributeMethod = InventoryServiceGrpc.getUpdateInventoryAttributeMethod) == null) {
          InventoryServiceGrpc.getUpdateInventoryAttributeMethod = getUpdateInventoryAttributeMethod = 
              io.grpc.MethodDescriptor.<example.myapp.inventory.grpc.UpdateInventoryAttributeRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InventoryService", "UpdateInventoryAttribute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.myapp.inventory.grpc.UpdateInventoryAttributeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("UpdateInventoryAttribute"))
                  .build();
          }
        }
     }
     return getUpdateInventoryAttributeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<example.myapp.inventory.grpc.SearchByIDRequest,
      example.myapp.inventory.grpc.SearchResponse> getSearchByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchByID",
      requestType = example.myapp.inventory.grpc.SearchByIDRequest.class,
      responseType = example.myapp.inventory.grpc.SearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.myapp.inventory.grpc.SearchByIDRequest,
      example.myapp.inventory.grpc.SearchResponse> getSearchByIDMethod() {
    io.grpc.MethodDescriptor<example.myapp.inventory.grpc.SearchByIDRequest, example.myapp.inventory.grpc.SearchResponse> getSearchByIDMethod;
    if ((getSearchByIDMethod = InventoryServiceGrpc.getSearchByIDMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getSearchByIDMethod = InventoryServiceGrpc.getSearchByIDMethod) == null) {
          InventoryServiceGrpc.getSearchByIDMethod = getSearchByIDMethod = 
              io.grpc.MethodDescriptor.<example.myapp.inventory.grpc.SearchByIDRequest, example.myapp.inventory.grpc.SearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InventoryService", "SearchByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.myapp.inventory.grpc.SearchByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.myapp.inventory.grpc.SearchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("SearchByID"))
                  .build();
          }
        }
     }
     return getSearchByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<example.myapp.inventory.grpc.SearchByKeyValueRequest,
      example.myapp.inventory.grpc.SearchResponse> getSearchByKeyValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchByKeyValue",
      requestType = example.myapp.inventory.grpc.SearchByKeyValueRequest.class,
      responseType = example.myapp.inventory.grpc.SearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.myapp.inventory.grpc.SearchByKeyValueRequest,
      example.myapp.inventory.grpc.SearchResponse> getSearchByKeyValueMethod() {
    io.grpc.MethodDescriptor<example.myapp.inventory.grpc.SearchByKeyValueRequest, example.myapp.inventory.grpc.SearchResponse> getSearchByKeyValueMethod;
    if ((getSearchByKeyValueMethod = InventoryServiceGrpc.getSearchByKeyValueMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getSearchByKeyValueMethod = InventoryServiceGrpc.getSearchByKeyValueMethod) == null) {
          InventoryServiceGrpc.getSearchByKeyValueMethod = getSearchByKeyValueMethod = 
              io.grpc.MethodDescriptor.<example.myapp.inventory.grpc.SearchByKeyValueRequest, example.myapp.inventory.grpc.SearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InventoryService", "SearchByKeyValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.myapp.inventory.grpc.SearchByKeyValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.myapp.inventory.grpc.SearchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("SearchByKeyValue"))
                  .build();
          }
        }
     }
     return getSearchByKeyValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<example.myapp.inventory.grpc.GetDistributionRequest,
      example.myapp.inventory.grpc.GetDistributionResponse> getGetDistributionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDistribution",
      requestType = example.myapp.inventory.grpc.GetDistributionRequest.class,
      responseType = example.myapp.inventory.grpc.GetDistributionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.myapp.inventory.grpc.GetDistributionRequest,
      example.myapp.inventory.grpc.GetDistributionResponse> getGetDistributionMethod() {
    io.grpc.MethodDescriptor<example.myapp.inventory.grpc.GetDistributionRequest, example.myapp.inventory.grpc.GetDistributionResponse> getGetDistributionMethod;
    if ((getGetDistributionMethod = InventoryServiceGrpc.getGetDistributionMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getGetDistributionMethod = InventoryServiceGrpc.getGetDistributionMethod) == null) {
          InventoryServiceGrpc.getGetDistributionMethod = getGetDistributionMethod = 
              io.grpc.MethodDescriptor.<example.myapp.inventory.grpc.GetDistributionRequest, example.myapp.inventory.grpc.GetDistributionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InventoryService", "GetDistribution"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.myapp.inventory.grpc.GetDistributionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.myapp.inventory.grpc.GetDistributionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("GetDistribution"))
                  .build();
          }
        }
     }
     return getGetDistributionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<example.myapp.inventory.grpc.SearchRangeRequest,
      example.myapp.inventory.grpc.SearchRangeResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = example.myapp.inventory.grpc.SearchRangeRequest.class,
      responseType = example.myapp.inventory.grpc.SearchRangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.myapp.inventory.grpc.SearchRangeRequest,
      example.myapp.inventory.grpc.SearchRangeResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<example.myapp.inventory.grpc.SearchRangeRequest, example.myapp.inventory.grpc.SearchRangeResponse> getSearchMethod;
    if ((getSearchMethod = InventoryServiceGrpc.getSearchMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getSearchMethod = InventoryServiceGrpc.getSearchMethod) == null) {
          InventoryServiceGrpc.getSearchMethod = getSearchMethod = 
              io.grpc.MethodDescriptor.<example.myapp.inventory.grpc.SearchRangeRequest, example.myapp.inventory.grpc.SearchRangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InventoryService", "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.myapp.inventory.grpc.SearchRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.myapp.inventory.grpc.SearchRangeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("Search"))
                  .build();
          }
        }
     }
     return getSearchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InventoryServiceStub newStub(io.grpc.Channel channel) {
    return new InventoryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InventoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InventoryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InventoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InventoryServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class InventoryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addInventoryRecord(example.myapp.inventory.grpc.AddInventoryRecordRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getAddInventoryRecordMethod(), responseObserver);
    }

    /**
     */
    public void updateInventoryAttribute(example.myapp.inventory.grpc.UpdateInventoryAttributeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateInventoryAttributeMethod(), responseObserver);
    }

    /**
     */
    public void searchByID(example.myapp.inventory.grpc.SearchByIDRequest request,
        io.grpc.stub.StreamObserver<example.myapp.inventory.grpc.SearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchByIDMethod(), responseObserver);
    }

    /**
     */
    public void searchByKeyValue(example.myapp.inventory.grpc.SearchByKeyValueRequest request,
        io.grpc.stub.StreamObserver<example.myapp.inventory.grpc.SearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchByKeyValueMethod(), responseObserver);
    }

    /**
     */
    public void getDistribution(example.myapp.inventory.grpc.GetDistributionRequest request,
        io.grpc.stub.StreamObserver<example.myapp.inventory.grpc.GetDistributionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDistributionMethod(), responseObserver);
    }

    /**
     */
    public void search(example.myapp.inventory.grpc.SearchRangeRequest request,
        io.grpc.stub.StreamObserver<example.myapp.inventory.grpc.SearchRangeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddInventoryRecordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                example.myapp.inventory.grpc.AddInventoryRecordRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_ADD_INVENTORY_RECORD)))
          .addMethod(
            getUpdateInventoryAttributeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                example.myapp.inventory.grpc.UpdateInventoryAttributeRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_INVENTORY_ATTRIBUTE)))
          .addMethod(
            getSearchByIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                example.myapp.inventory.grpc.SearchByIDRequest,
                example.myapp.inventory.grpc.SearchResponse>(
                  this, METHODID_SEARCH_BY_ID)))
          .addMethod(
            getSearchByKeyValueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                example.myapp.inventory.grpc.SearchByKeyValueRequest,
                example.myapp.inventory.grpc.SearchResponse>(
                  this, METHODID_SEARCH_BY_KEY_VALUE)))
          .addMethod(
            getGetDistributionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                example.myapp.inventory.grpc.GetDistributionRequest,
                example.myapp.inventory.grpc.GetDistributionResponse>(
                  this, METHODID_GET_DISTRIBUTION)))
          .addMethod(
            getSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                example.myapp.inventory.grpc.SearchRangeRequest,
                example.myapp.inventory.grpc.SearchRangeResponse>(
                  this, METHODID_SEARCH)))
          .build();
    }
  }

  /**
   */
  public static final class InventoryServiceStub extends io.grpc.stub.AbstractStub<InventoryServiceStub> {
    private InventoryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void addInventoryRecord(example.myapp.inventory.grpc.AddInventoryRecordRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddInventoryRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateInventoryAttribute(example.myapp.inventory.grpc.UpdateInventoryAttributeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateInventoryAttributeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchByID(example.myapp.inventory.grpc.SearchByIDRequest request,
        io.grpc.stub.StreamObserver<example.myapp.inventory.grpc.SearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchByKeyValue(example.myapp.inventory.grpc.SearchByKeyValueRequest request,
        io.grpc.stub.StreamObserver<example.myapp.inventory.grpc.SearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchByKeyValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDistribution(example.myapp.inventory.grpc.GetDistributionRequest request,
        io.grpc.stub.StreamObserver<example.myapp.inventory.grpc.GetDistributionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDistributionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void search(example.myapp.inventory.grpc.SearchRangeRequest request,
        io.grpc.stub.StreamObserver<example.myapp.inventory.grpc.SearchRangeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InventoryServiceBlockingStub extends io.grpc.stub.AbstractStub<InventoryServiceBlockingStub> {
    private InventoryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty addInventoryRecord(example.myapp.inventory.grpc.AddInventoryRecordRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddInventoryRecordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateInventoryAttribute(example.myapp.inventory.grpc.UpdateInventoryAttributeRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateInventoryAttributeMethod(), getCallOptions(), request);
    }

    /**
     */
    public example.myapp.inventory.grpc.SearchResponse searchByID(example.myapp.inventory.grpc.SearchByIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchByIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public example.myapp.inventory.grpc.SearchResponse searchByKeyValue(example.myapp.inventory.grpc.SearchByKeyValueRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchByKeyValueMethod(), getCallOptions(), request);
    }

    /**
     */
    public example.myapp.inventory.grpc.GetDistributionResponse getDistribution(example.myapp.inventory.grpc.GetDistributionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDistributionMethod(), getCallOptions(), request);
    }

    /**
     */
    public example.myapp.inventory.grpc.SearchRangeResponse search(example.myapp.inventory.grpc.SearchRangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InventoryServiceFutureStub extends io.grpc.stub.AbstractStub<InventoryServiceFutureStub> {
    private InventoryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addInventoryRecord(
        example.myapp.inventory.grpc.AddInventoryRecordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddInventoryRecordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateInventoryAttribute(
        example.myapp.inventory.grpc.UpdateInventoryAttributeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateInventoryAttributeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.myapp.inventory.grpc.SearchResponse> searchByID(
        example.myapp.inventory.grpc.SearchByIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchByIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.myapp.inventory.grpc.SearchResponse> searchByKeyValue(
        example.myapp.inventory.grpc.SearchByKeyValueRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchByKeyValueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.myapp.inventory.grpc.GetDistributionResponse> getDistribution(
        example.myapp.inventory.grpc.GetDistributionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDistributionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.myapp.inventory.grpc.SearchRangeResponse> search(
        example.myapp.inventory.grpc.SearchRangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_INVENTORY_RECORD = 0;
  private static final int METHODID_UPDATE_INVENTORY_ATTRIBUTE = 1;
  private static final int METHODID_SEARCH_BY_ID = 2;
  private static final int METHODID_SEARCH_BY_KEY_VALUE = 3;
  private static final int METHODID_GET_DISTRIBUTION = 4;
  private static final int METHODID_SEARCH = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InventoryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InventoryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_INVENTORY_RECORD:
          serviceImpl.addInventoryRecord((example.myapp.inventory.grpc.AddInventoryRecordRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_INVENTORY_ATTRIBUTE:
          serviceImpl.updateInventoryAttribute((example.myapp.inventory.grpc.UpdateInventoryAttributeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SEARCH_BY_ID:
          serviceImpl.searchByID((example.myapp.inventory.grpc.SearchByIDRequest) request,
              (io.grpc.stub.StreamObserver<example.myapp.inventory.grpc.SearchResponse>) responseObserver);
          break;
        case METHODID_SEARCH_BY_KEY_VALUE:
          serviceImpl.searchByKeyValue((example.myapp.inventory.grpc.SearchByKeyValueRequest) request,
              (io.grpc.stub.StreamObserver<example.myapp.inventory.grpc.SearchResponse>) responseObserver);
          break;
        case METHODID_GET_DISTRIBUTION:
          serviceImpl.getDistribution((example.myapp.inventory.grpc.GetDistributionRequest) request,
              (io.grpc.stub.StreamObserver<example.myapp.inventory.grpc.GetDistributionResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((example.myapp.inventory.grpc.SearchRangeRequest) request,
              (io.grpc.stub.StreamObserver<example.myapp.inventory.grpc.SearchRangeResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class InventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InventoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return example.myapp.inventory.grpc.InventoryRecordProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InventoryService");
    }
  }

  private static final class InventoryServiceFileDescriptorSupplier
      extends InventoryServiceBaseDescriptorSupplier {
    InventoryServiceFileDescriptorSupplier() {}
  }

  private static final class InventoryServiceMethodDescriptorSupplier
      extends InventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InventoryServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (InventoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InventoryServiceFileDescriptorSupplier())
              .addMethod(getAddInventoryRecordMethod())
              .addMethod(getUpdateInventoryAttributeMethod())
              .addMethod(getSearchByIDMethod())
              .addMethod(getSearchByKeyValueMethod())
              .addMethod(getGetDistributionMethod())
              .addMethod(getSearchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
