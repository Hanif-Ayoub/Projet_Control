package ma.enset.immatriculationservice.grpc.stubs;

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
    comments = "Source: immatriculation.proto")
public final class ImmatriculationServiceGrpc {

  private ImmatriculationServiceGrpc() {}

  public static final String SERVICE_NAME = "ImmatriculationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest,
      ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getVehiculesListResponse> getGetVehiculesListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehiculesList",
      requestType = ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest.class,
      responseType = ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getVehiculesListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest,
      ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getVehiculesListResponse> getGetVehiculesListMethod() {
    io.grpc.MethodDescriptor<ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest, ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getVehiculesListResponse> getGetVehiculesListMethod;
    if ((getGetVehiculesListMethod = ImmatriculationServiceGrpc.getGetVehiculesListMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getGetVehiculesListMethod = ImmatriculationServiceGrpc.getGetVehiculesListMethod) == null) {
          ImmatriculationServiceGrpc.getGetVehiculesListMethod = getGetVehiculesListMethod = 
              io.grpc.MethodDescriptor.<ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest, ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getVehiculesListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "getVehiculesList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getVehiculesListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("getVehiculesList"))
                  .build();
          }
        }
     }
     return getGetVehiculesListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest,
      ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getOwnersListResponse> getGetOwnersListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOwnersList",
      requestType = ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest.class,
      responseType = ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getOwnersListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest,
      ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getOwnersListResponse> getGetOwnersListMethod() {
    io.grpc.MethodDescriptor<ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest, ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getOwnersListResponse> getGetOwnersListMethod;
    if ((getGetOwnersListMethod = ImmatriculationServiceGrpc.getGetOwnersListMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getGetOwnersListMethod = ImmatriculationServiceGrpc.getGetOwnersListMethod) == null) {
          ImmatriculationServiceGrpc.getGetOwnersListMethod = getGetOwnersListMethod = 
              io.grpc.MethodDescriptor.<ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest, ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getOwnersListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "getOwnersList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getOwnersListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("getOwnersList"))
                  .build();
          }
        }
     }
     return getGetOwnersListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImmatriculationServiceStub newStub(io.grpc.Channel channel) {
    return new ImmatriculationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImmatriculationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImmatriculationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImmatriculationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImmatriculationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ImmatriculationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getVehiculesList(ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getVehiculesListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehiculesListMethod(), responseObserver);
    }

    /**
     * <pre>
     *rpc getVehicule(id) returns (Vehicule);
     *rpc getOwner(id) returns (Vehicule);
     * </pre>
     */
    public void getOwnersList(ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getOwnersListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOwnersListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetVehiculesListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest,
                ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getVehiculesListResponse>(
                  this, METHODID_GET_VEHICULES_LIST)))
          .addMethod(
            getGetOwnersListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest,
                ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getOwnersListResponse>(
                  this, METHODID_GET_OWNERS_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class ImmatriculationServiceStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceStub> {
    private ImmatriculationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getVehiculesList(ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getVehiculesListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehiculesListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *rpc getVehicule(id) returns (Vehicule);
     *rpc getOwner(id) returns (Vehicule);
     * </pre>
     */
    public void getOwnersList(ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getOwnersListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOwnersListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ImmatriculationServiceBlockingStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceBlockingStub> {
    private ImmatriculationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getVehiculesListResponse getVehiculesList(ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVehiculesListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *rpc getVehicule(id) returns (Vehicule);
     *rpc getOwner(id) returns (Vehicule);
     * </pre>
     */
    public ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getOwnersListResponse getOwnersList(ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOwnersListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ImmatriculationServiceFutureStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceFutureStub> {
    private ImmatriculationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getVehiculesListResponse> getVehiculesList(
        ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehiculesListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *rpc getVehicule(id) returns (Vehicule);
     *rpc getOwner(id) returns (Vehicule);
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getOwnersListResponse> getOwnersList(
        ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOwnersListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VEHICULES_LIST = 0;
  private static final int METHODID_GET_OWNERS_LIST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImmatriculationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImmatriculationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VEHICULES_LIST:
          serviceImpl.getVehiculesList((ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getVehiculesListResponse>) responseObserver);
          break;
        case METHODID_GET_OWNERS_LIST:
          serviceImpl.getOwnersList((ma.enset.immatriculationservice.grpc.stubs.Immatriculation.ListRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getOwnersListResponse>) responseObserver);
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

  private static abstract class ImmatriculationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImmatriculationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.enset.immatriculationservice.grpc.stubs.Immatriculation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImmatriculationService");
    }
  }

  private static final class ImmatriculationServiceFileDescriptorSupplier
      extends ImmatriculationServiceBaseDescriptorSupplier {
    ImmatriculationServiceFileDescriptorSupplier() {}
  }

  private static final class ImmatriculationServiceMethodDescriptorSupplier
      extends ImmatriculationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImmatriculationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ImmatriculationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImmatriculationServiceFileDescriptorSupplier())
              .addMethod(getGetVehiculesListMethod())
              .addMethod(getGetOwnersListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
