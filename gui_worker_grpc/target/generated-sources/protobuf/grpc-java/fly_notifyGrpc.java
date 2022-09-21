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
    comments = "Source: news_thefly.proto")
public final class fly_notifyGrpc {

  private fly_notifyGrpc() {}

  public static final String SERVICE_NAME = "fly_notify";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      NewsThefly.fly_news> getNewsTheflyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "news_thefly",
      requestType = com.google.protobuf.Empty.class,
      responseType = NewsThefly.fly_news.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      NewsThefly.fly_news> getNewsTheflyMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, NewsThefly.fly_news> getNewsTheflyMethod;
    if ((getNewsTheflyMethod = fly_notifyGrpc.getNewsTheflyMethod) == null) {
      synchronized (fly_notifyGrpc.class) {
        if ((getNewsTheflyMethod = fly_notifyGrpc.getNewsTheflyMethod) == null) {
          fly_notifyGrpc.getNewsTheflyMethod = getNewsTheflyMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, NewsThefly.fly_news>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "news_thefly"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  NewsThefly.fly_news.getDefaultInstance()))
              .setSchemaDescriptor(new fly_notifyMethodDescriptorSupplier("news_thefly"))
              .build();
        }
      }
    }
    return getNewsTheflyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static fly_notifyStub newStub(io.grpc.Channel channel) {
    return new fly_notifyStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static fly_notifyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new fly_notifyBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static fly_notifyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new fly_notifyFutureStub(channel);
  }

  /**
   */
  public static abstract class fly_notifyImplBase implements io.grpc.BindableService {

    /**
     */
    public void newsThefly(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<NewsThefly.fly_news> responseObserver) {
      asyncUnimplementedUnaryCall(getNewsTheflyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNewsTheflyMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                NewsThefly.fly_news>(
                  this, METHODID_NEWS_THEFLY)))
          .build();
    }
  }

  /**
   */
  public static final class fly_notifyStub extends io.grpc.stub.AbstractStub<fly_notifyStub> {
    private fly_notifyStub(io.grpc.Channel channel) {
      super(channel);
    }

    private fly_notifyStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected fly_notifyStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new fly_notifyStub(channel, callOptions);
    }

    /**
     */
    public void newsThefly(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<NewsThefly.fly_news> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getNewsTheflyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class fly_notifyBlockingStub extends io.grpc.stub.AbstractStub<fly_notifyBlockingStub> {
    private fly_notifyBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private fly_notifyBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected fly_notifyBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new fly_notifyBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<NewsThefly.fly_news> newsThefly(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getNewsTheflyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class fly_notifyFutureStub extends io.grpc.stub.AbstractStub<fly_notifyFutureStub> {
    private fly_notifyFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private fly_notifyFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected fly_notifyFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new fly_notifyFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_NEWS_THEFLY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final fly_notifyImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(fly_notifyImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NEWS_THEFLY:
          serviceImpl.newsThefly((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<NewsThefly.fly_news>) responseObserver);
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

  private static abstract class fly_notifyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    fly_notifyBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return NewsThefly.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("fly_notify");
    }
  }

  private static final class fly_notifyFileDescriptorSupplier
      extends fly_notifyBaseDescriptorSupplier {
    fly_notifyFileDescriptorSupplier() {}
  }

  private static final class fly_notifyMethodDescriptorSupplier
      extends fly_notifyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    fly_notifyMethodDescriptorSupplier(String methodName) {
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
      synchronized (fly_notifyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new fly_notifyFileDescriptorSupplier())
              .addMethod(getNewsTheflyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
