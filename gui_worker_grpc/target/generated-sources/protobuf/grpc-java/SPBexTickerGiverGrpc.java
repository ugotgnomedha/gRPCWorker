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
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: SPBexchangeTickers.proto")
public final class SPBexTickerGiverGrpc {

  private SPBexTickerGiverGrpc() {}

  public static final String SERVICE_NAME = "SPBexTickerGiver";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      SPBexchangeTickers.workerReplySpb> getSpbexchangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "spbexchange",
      requestType = com.google.protobuf.Empty.class,
      responseType = SPBexchangeTickers.workerReplySpb.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      SPBexchangeTickers.workerReplySpb> getSpbexchangeMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, SPBexchangeTickers.workerReplySpb> getSpbexchangeMethod;
    if ((getSpbexchangeMethod = SPBexTickerGiverGrpc.getSpbexchangeMethod) == null) {
      synchronized (SPBexTickerGiverGrpc.class) {
        if ((getSpbexchangeMethod = SPBexTickerGiverGrpc.getSpbexchangeMethod) == null) {
          SPBexTickerGiverGrpc.getSpbexchangeMethod = getSpbexchangeMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, SPBexchangeTickers.workerReplySpb>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "spbexchange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SPBexchangeTickers.workerReplySpb.getDefaultInstance()))
              .setSchemaDescriptor(new SPBexTickerGiverMethodDescriptorSupplier("spbexchange"))
              .build();
        }
      }
    }
    return getSpbexchangeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SPBexTickerGiverStub newStub(io.grpc.Channel channel) {
    return new SPBexTickerGiverStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SPBexTickerGiverBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SPBexTickerGiverBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SPBexTickerGiverFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SPBexTickerGiverFutureStub(channel);
  }

  /**
   */
  public static abstract class SPBexTickerGiverImplBase implements io.grpc.BindableService {

    /**
     */
    public void spbexchange(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<SPBexchangeTickers.workerReplySpb> responseObserver) {
      asyncUnimplementedUnaryCall(getSpbexchangeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSpbexchangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                SPBexchangeTickers.workerReplySpb>(
                  this, METHODID_SPBEXCHANGE)))
          .build();
    }
  }

  /**
   */
  public static final class SPBexTickerGiverStub extends io.grpc.stub.AbstractStub<SPBexTickerGiverStub> {
    private SPBexTickerGiverStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SPBexTickerGiverStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SPBexTickerGiverStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SPBexTickerGiverStub(channel, callOptions);
    }

    /**
     */
    public void spbexchange(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<SPBexchangeTickers.workerReplySpb> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSpbexchangeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SPBexTickerGiverBlockingStub extends io.grpc.stub.AbstractStub<SPBexTickerGiverBlockingStub> {
    private SPBexTickerGiverBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SPBexTickerGiverBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SPBexTickerGiverBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SPBexTickerGiverBlockingStub(channel, callOptions);
    }

    /**
     */
    public SPBexchangeTickers.workerReplySpb spbexchange(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSpbexchangeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SPBexTickerGiverFutureStub extends io.grpc.stub.AbstractStub<SPBexTickerGiverFutureStub> {
    private SPBexTickerGiverFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SPBexTickerGiverFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SPBexTickerGiverFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SPBexTickerGiverFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SPBexchangeTickers.workerReplySpb> spbexchange(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSpbexchangeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SPBEXCHANGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SPBexTickerGiverImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SPBexTickerGiverImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SPBEXCHANGE:
          serviceImpl.spbexchange((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<SPBexchangeTickers.workerReplySpb>) responseObserver);
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

  private static abstract class SPBexTickerGiverBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SPBexTickerGiverBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return SPBexchangeTickers.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SPBexTickerGiver");
    }
  }

  private static final class SPBexTickerGiverFileDescriptorSupplier
      extends SPBexTickerGiverBaseDescriptorSupplier {
    SPBexTickerGiverFileDescriptorSupplier() {}
  }

  private static final class SPBexTickerGiverMethodDescriptorSupplier
      extends SPBexTickerGiverBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SPBexTickerGiverMethodDescriptorSupplier(String methodName) {
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
      synchronized (SPBexTickerGiverGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SPBexTickerGiverFileDescriptorSupplier())
              .addMethod(getSpbexchangeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
