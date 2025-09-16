package com.example.server.service;

import com.example.common.HelloReply;
import com.example.common.HelloRequest;
import com.example.common.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class HelloService extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {

        HelloReply reply = HelloReply.newBuilder()
                .setMessage("Hello " + request.getName() + " from gRPC Server")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
