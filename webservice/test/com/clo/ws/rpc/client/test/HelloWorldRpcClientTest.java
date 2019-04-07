package com.clo.ws.com.clo.ws.rpc.client.test;

import com.clo.ws.rpc.client.HelloWorldRpcClient;
import com.clo.ws.rpc.server.HelloWorldRpc;

import java.net.MalformedURLException;

/**
 * HelloWorldRpcClientTest
 *
 * @author Cloneable
 * @date 2019/4/5 14:57:05
 * @description unit test for com.clo.ws.rpc.client.HelloWorldRpcClient
 */
public class HelloWorldRpcClientTest {
    public static void main(String[] args) {
        HelloWorldRpcClient helloWorldRpcClient = new HelloWorldRpcClient("http://localhost:7999/ws/rpc/hello?wsdl", HelloWorldRpc.class);
        try {
            System.out.println(helloWorldRpcClient.getHelloWorldString("cloneable"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
