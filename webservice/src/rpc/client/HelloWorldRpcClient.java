package com.clo.ws.rpc.client;

import com.clo.ws.client.BaseClient;
import com.clo.ws.rpc.server.HelloWorldRpc;

import java.net.MalformedURLException;

/**
 * com.clo.ws.rpc.client.HelloWorldRpcClient
 *
 * @author Cloneable
 * @date 2019/4/5 13:32:05
 * @description web service client by Rpc type
 */
public class HelloWorldRpcClient extends BaseClient<HelloWorldRpc> {
    private HelloWorldRpc helloWorldRpc;

    public HelloWorldRpcClient(String url, Class helloWorldRpcClazz) {
        super(url, helloWorldRpcClazz);
    }

    public String getHelloWorldString(String name) throws MalformedURLException {
        return getService().getHelloWorldString(name);
    }
}
