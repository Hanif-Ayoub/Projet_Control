package ma.enset.radarservice.grpc.stubs;

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
    comments = "Source: radar.proto")
public final class radarDeviceGrpc {

  private radarDeviceGrpc() {}

  public static final String SERVICE_NAME = "radarDevice";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.enset.radarservice.grpc.stubs.Radar.radarInformations,
      ma.enset.radarservice.grpc.stubs.Radar.infraction> getGetConnectedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getConnected",
      requestType = ma.enset.radarservice.grpc.stubs.Radar.radarInformations.class,
      responseType = ma.enset.radarservice.grpc.stubs.Radar.infraction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.radarservice.grpc.stubs.Radar.radarInformations,
      ma.enset.radarservice.grpc.stubs.Radar.infraction> getGetConnectedMethod() {
    io.grpc.MethodDescriptor<ma.enset.radarservice.grpc.stubs.Radar.radarInformations, ma.enset.radarservice.grpc.stubs.Radar.infraction> getGetConnectedMethod;
    if ((getGetConnectedMethod = radarDeviceGrpc.getGetConnectedMethod) == null) {
      synchronized (radarDeviceGrpc.class) {
        if ((getGetConnectedMethod = radarDeviceGrpc.getGetConnectedMethod) == null) {
          radarDeviceGrpc.getGetConnectedMethod = getGetConnectedMethod = 
              io.grpc.MethodDescriptor.<ma.enset.radarservice.grpc.stubs.Radar.radarInformations, ma.enset.radarservice.grpc.stubs.Radar.infraction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "radarDevice", "getConnected"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.radarservice.grpc.stubs.Radar.radarInformations.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.radarservice.grpc.stubs.Radar.infraction.getDefaultInstance()))
                  .setSchemaDescriptor(new radarDeviceMethodDescriptorSupplier("getConnected"))
                  .build();
          }
        }
     }
     return getGetConnectedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static radarDeviceStub newStub(io.grpc.Channel channel) {
    return new radarDeviceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static radarDeviceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new radarDeviceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static radarDeviceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new radarDeviceFutureStub(channel);
  }

  /**
   */
  public static abstract class radarDeviceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getConnected(ma.enset.radarservice.grpc.stubs.Radar.radarInformations request,
        io.grpc.stub.StreamObserver<ma.enset.radarservice.grpc.stubs.Radar.infraction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetConnectedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetConnectedMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ma.enset.radarservice.grpc.stubs.Radar.radarInformations,
                ma.enset.radarservice.grpc.stubs.Radar.infraction>(
                  this, METHODID_GET_CONNECTED)))
          .build();
    }
  }

  /**
   */
  public static final class radarDeviceStub extends io.grpc.stub.AbstractStub<radarDeviceStub> {
    private radarDeviceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private radarDeviceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected radarDeviceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new radarDeviceStub(channel, callOptions);
    }

    /**
     */
    public void getConnected(ma.enset.radarservice.grpc.stubs.Radar.radarInformations request,
        io.grpc.stub.StreamObserver<ma.enset.radarservice.grpc.stubs.Radar.infraction> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetConnectedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class radarDeviceBlockingStub extends io.grpc.stub.AbstractStub<radarDeviceBlockingStub> {
    private radarDeviceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private radarDeviceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected radarDeviceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new radarDeviceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<ma.enset.radarservice.grpc.stubs.Radar.infraction> getConnected(
        ma.enset.radarservice.grpc.stubs.Radar.radarInformations request) {
      return blockingServerStreamingCall(
          getChannel(), getGetConnectedMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class radarDeviceFutureStub extends io.grpc.stub.AbstractStub<radarDeviceFutureStub> {
    private radarDeviceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private radarDeviceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected radarDeviceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new radarDeviceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_CONNECTED = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final radarDeviceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(radarDeviceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CONNECTED:
          serviceImpl.getConnected((ma.enset.radarservice.grpc.stubs.Radar.radarInformations) request,
              (io.grpc.stub.StreamObserver<ma.enset.radarservice.grpc.stubs.Radar.infraction>) responseObserver);
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

  private static abstract class radarDeviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    radarDeviceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.enset.radarservice.grpc.stubs.Radar.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("radarDevice");
    }
  }

  private static final class radarDeviceFileDescriptorSupplier
      extends radarDeviceBaseDescriptorSupplier {
    radarDeviceFileDescriptorSupplier() {}
  }

  private static final class radarDeviceMethodDescriptorSupplier
      extends radarDeviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    radarDeviceMethodDescriptorSupplier(String methodName) {
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
      synchronized (radarDeviceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new radarDeviceFileDescriptorSupplier())
              .addMethod(getGetConnectedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
