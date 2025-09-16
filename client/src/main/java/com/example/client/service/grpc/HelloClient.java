package com.example.client.service.grpc;

import com.example.common.HelloReply;
import com.example.common.HelloRequest;
import com.example.common.HelloServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Component;

@Component
public class HelloClient {

    @GrpcClient("helloService")
    private HelloServiceGrpc.HelloServiceBlockingStub stub;

    public String sendMessage(String name) {
        HelloReply reply = stub.sayHello(
          HelloRequest.newBuilder()
                  .setName(name)
                  .build()
        );
        return reply.getMessage();
    }

}
