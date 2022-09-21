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
    comments = "Source: uploadTickersToDB.proto")
public final class UploadTickersGrpc {

  private UploadTickersGrpc() {}

  public static final String SERVICE_NAME = "UploadTickers";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<UploadTickersToDB.screenerTickers,
      com.google.protobuf.Empty> getUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "upload",
      requestType = UploadTickersToDB.screenerTickers.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UploadTickersToDB.screenerTickers,
      com.google.protobuf.Empty> getUploadMethod() {
    io.grpc.MethodDescriptor<UploadTickersToDB.screenerTickers, com.google.protobuf.Empty> getUploadMethod;
    if ((getUploadMethod = UploadTickersGrpc.getUploadMethod) == null) {
      synchronized (UploadTickersGrpc.class) {
        if ((getUploadMethod = UploadTickersGrpc.getUploadMethod) == null) {
          UploadTickersGrpc.getUploadMethod = getUploadMethod =
              io.grpc.MethodDescriptor.<UploadTickersToDB.screenerTickers, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "upload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UploadTickersToDB.screenerTickers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UploadTickersMethodDescriptorSupplier("upload"))
              .build();
        }
      }
    }
    return getUploadMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UploadTickersStub newStub(io.grpc.Channel channel) {
    return new UploadTickersStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UploadTickersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UploadTickersBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UploadTickersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UploadTickersFutureStub(channel);
  }

  /**
   */
  public static abstract class UploadTickersImplBase implements io.grpc.BindableService {

    /**
     */
    public void upload(UploadTickersToDB.screenerTickers request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUploadMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                UploadTickersToDB.screenerTickers,
                com.google.protobuf.Empty>(
                  this, METHODID_UPLOAD)))
          .build();
    }
  }

  /**
   */
  public static final class UploadTickersStub extends io.grpc.stub.AbstractStub<UploadTickersStub> {
    private UploadTickersStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UploadTickersStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UploadTickersStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UploadTickersStub(channel, callOptions);
    }

    /**
     */
    public void upload(UploadTickersToDB.screenerTickers request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UploadTickersBlockingStub extends io.grpc.stub.AbstractStub<UploadTickersBlockingStub> {
    private UploadTickersBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UploadTickersBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UploadTickersBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UploadTickersBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty upload(UploadTickersToDB.screenerTickers request) {
      return blockingUnaryCall(
          getChannel(), getUploadMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UploadTickersFutureStub extends io.grpc.stub.AbstractStub<UploadTickersFutureStub> {
    private UploadTickersFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UploadTickersFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UploadTickersFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UploadTickersFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> upload(
        UploadTickersToDB.screenerTickers request) {
      return futureUnaryCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UploadTickersImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UploadTickersImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD:
          serviceImpl.upload((UploadTickersToDB.screenerTickers) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class UploadTickersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UploadTickersBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return UploadTickersToDB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UploadTickers");
    }
  }

  private static final class UploadTickersFileDescriptorSupplier
      extends UploadTickersBaseDescriptorSupplier {
    UploadTickersFileDescriptorSupplier() {}
  }

  private static final class UploadTickersMethodDescriptorSupplier
      extends UploadTickersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UploadTickersMethodDescriptorSupplier(String methodName) {
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
      synchronized (UploadTickersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UploadTickersFileDescriptorSupplier())
              .addMethod(getUploadMethod())
              .build();
        }
      }
    }
    return result;
  }
}
