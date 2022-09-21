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
    comments = "Source: news_benzinga.proto")
public final class benzinga_notifyGrpc {

  private benzinga_notifyGrpc() {}

  public static final String SERVICE_NAME = "benzinga_notify";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      NewsBenzinga.benzinga_news> getNewsBenzingaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "news_benzinga",
      requestType = com.google.protobuf.Empty.class,
      responseType = NewsBenzinga.benzinga_news.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      NewsBenzinga.benzinga_news> getNewsBenzingaMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, NewsBenzinga.benzinga_news> getNewsBenzingaMethod;
    if ((getNewsBenzingaMethod = benzinga_notifyGrpc.getNewsBenzingaMethod) == null) {
      synchronized (benzinga_notifyGrpc.class) {
        if ((getNewsBenzingaMethod = benzinga_notifyGrpc.getNewsBenzingaMethod) == null) {
          benzinga_notifyGrpc.getNewsBenzingaMethod = getNewsBenzingaMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, NewsBenzinga.benzinga_news>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "news_benzinga"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  NewsBenzinga.benzinga_news.getDefaultInstance()))
              .setSchemaDescriptor(new benzinga_notifyMethodDescriptorSupplier("news_benzinga"))
              .build();
        }
      }
    }
    return getNewsBenzingaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static benzinga_notifyStub newStub(io.grpc.Channel channel) {
    return new benzinga_notifyStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static benzinga_notifyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new benzinga_notifyBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static benzinga_notifyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new benzinga_notifyFutureStub(channel);
  }

  /**
   */
  public static abstract class benzinga_notifyImplBase implements io.grpc.BindableService {

    /**
     */
    public void newsBenzinga(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<NewsBenzinga.benzinga_news> responseObserver) {
      asyncUnimplementedUnaryCall(getNewsBenzingaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNewsBenzingaMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                NewsBenzinga.benzinga_news>(
                  this, METHODID_NEWS_BENZINGA)))
          .build();
    }
  }

  /**
   */
  public static final class benzinga_notifyStub extends io.grpc.stub.AbstractStub<benzinga_notifyStub> {
    private benzinga_notifyStub(io.grpc.Channel channel) {
      super(channel);
    }

    private benzinga_notifyStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected benzinga_notifyStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new benzinga_notifyStub(channel, callOptions);
    }

    /**
     */
    public void newsBenzinga(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<NewsBenzinga.benzinga_news> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getNewsBenzingaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class benzinga_notifyBlockingStub extends io.grpc.stub.AbstractStub<benzinga_notifyBlockingStub> {
    private benzinga_notifyBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private benzinga_notifyBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected benzinga_notifyBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new benzinga_notifyBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<NewsBenzinga.benzinga_news> newsBenzinga(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getNewsBenzingaMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class benzinga_notifyFutureStub extends io.grpc.stub.AbstractStub<benzinga_notifyFutureStub> {
    private benzinga_notifyFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private benzinga_notifyFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected benzinga_notifyFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new benzinga_notifyFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_NEWS_BENZINGA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final benzinga_notifyImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(benzinga_notifyImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NEWS_BENZINGA:
          serviceImpl.newsBenzinga((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<NewsBenzinga.benzinga_news>) responseObserver);
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

  private static abstract class benzinga_notifyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    benzinga_notifyBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return NewsBenzinga.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("benzinga_notify");
    }
  }

  private static final class benzinga_notifyFileDescriptorSupplier
      extends benzinga_notifyBaseDescriptorSupplier {
    benzinga_notifyFileDescriptorSupplier() {}
  }

  private static final class benzinga_notifyMethodDescriptorSupplier
      extends benzinga_notifyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    benzinga_notifyMethodDescriptorSupplier(String methodName) {
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
      synchronized (benzinga_notifyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new benzinga_notifyFileDescriptorSupplier())
              .addMethod(getNewsBenzingaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
