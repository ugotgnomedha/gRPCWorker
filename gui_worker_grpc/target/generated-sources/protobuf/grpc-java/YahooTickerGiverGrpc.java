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
    comments = "Source: settings_receiver.proto")
public final class YahooTickerGiverGrpc {

  private YahooTickerGiverGrpc() {}

  public static final String SERVICE_NAME = "YahooTickerGiver";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<SettingsReceiver.settingsRequestYahoo,
      SettingsReceiver.workerReplyYahoo> getYahooMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "yahoo",
      requestType = SettingsReceiver.settingsRequestYahoo.class,
      responseType = SettingsReceiver.workerReplyYahoo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SettingsReceiver.settingsRequestYahoo,
      SettingsReceiver.workerReplyYahoo> getYahooMethod() {
    io.grpc.MethodDescriptor<SettingsReceiver.settingsRequestYahoo, SettingsReceiver.workerReplyYahoo> getYahooMethod;
    if ((getYahooMethod = YahooTickerGiverGrpc.getYahooMethod) == null) {
      synchronized (YahooTickerGiverGrpc.class) {
        if ((getYahooMethod = YahooTickerGiverGrpc.getYahooMethod) == null) {
          YahooTickerGiverGrpc.getYahooMethod = getYahooMethod =
              io.grpc.MethodDescriptor.<SettingsReceiver.settingsRequestYahoo, SettingsReceiver.workerReplyYahoo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "yahoo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SettingsReceiver.settingsRequestYahoo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SettingsReceiver.workerReplyYahoo.getDefaultInstance()))
              .setSchemaDescriptor(new YahooTickerGiverMethodDescriptorSupplier("yahoo"))
              .build();
        }
      }
    }
    return getYahooMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static YahooTickerGiverStub newStub(io.grpc.Channel channel) {
    return new YahooTickerGiverStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static YahooTickerGiverBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new YahooTickerGiverBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static YahooTickerGiverFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new YahooTickerGiverFutureStub(channel);
  }

  /**
   */
  public static abstract class YahooTickerGiverImplBase implements io.grpc.BindableService {

    /**
     */
    public void yahoo(SettingsReceiver.settingsRequestYahoo request,
        io.grpc.stub.StreamObserver<SettingsReceiver.workerReplyYahoo> responseObserver) {
      asyncUnimplementedUnaryCall(getYahooMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getYahooMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                SettingsReceiver.settingsRequestYahoo,
                SettingsReceiver.workerReplyYahoo>(
                  this, METHODID_YAHOO)))
          .build();
    }
  }

  /**
   */
  public static final class YahooTickerGiverStub extends io.grpc.stub.AbstractStub<YahooTickerGiverStub> {
    private YahooTickerGiverStub(io.grpc.Channel channel) {
      super(channel);
    }

    private YahooTickerGiverStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YahooTickerGiverStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new YahooTickerGiverStub(channel, callOptions);
    }

    /**
     */
    public void yahoo(SettingsReceiver.settingsRequestYahoo request,
        io.grpc.stub.StreamObserver<SettingsReceiver.workerReplyYahoo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getYahooMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class YahooTickerGiverBlockingStub extends io.grpc.stub.AbstractStub<YahooTickerGiverBlockingStub> {
    private YahooTickerGiverBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private YahooTickerGiverBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YahooTickerGiverBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new YahooTickerGiverBlockingStub(channel, callOptions);
    }

    /**
     */
    public SettingsReceiver.workerReplyYahoo yahoo(SettingsReceiver.settingsRequestYahoo request) {
      return blockingUnaryCall(
          getChannel(), getYahooMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class YahooTickerGiverFutureStub extends io.grpc.stub.AbstractStub<YahooTickerGiverFutureStub> {
    private YahooTickerGiverFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private YahooTickerGiverFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YahooTickerGiverFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new YahooTickerGiverFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SettingsReceiver.workerReplyYahoo> yahoo(
        SettingsReceiver.settingsRequestYahoo request) {
      return futureUnaryCall(
          getChannel().newCall(getYahooMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_YAHOO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final YahooTickerGiverImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(YahooTickerGiverImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_YAHOO:
          serviceImpl.yahoo((SettingsReceiver.settingsRequestYahoo) request,
              (io.grpc.stub.StreamObserver<SettingsReceiver.workerReplyYahoo>) responseObserver);
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

  private static abstract class YahooTickerGiverBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    YahooTickerGiverBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return SettingsReceiver.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("YahooTickerGiver");
    }
  }

  private static final class YahooTickerGiverFileDescriptorSupplier
      extends YahooTickerGiverBaseDescriptorSupplier {
    YahooTickerGiverFileDescriptorSupplier() {}
  }

  private static final class YahooTickerGiverMethodDescriptorSupplier
      extends YahooTickerGiverBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    YahooTickerGiverMethodDescriptorSupplier(String methodName) {
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
      synchronized (YahooTickerGiverGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new YahooTickerGiverFileDescriptorSupplier())
              .addMethod(getYahooMethod())
              .build();
        }
      }
    }
    return result;
  }
}
