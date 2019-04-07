package com.clo.ws.rpc.server;

import javax.xml.ws.Endpoint;

/**
 * com.clo.ws.rpc.server.WsPublisher
 *
 * @author Cloneable
 * @date 2019/4/5 13:19:05
 * @description
 */
public class WsPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:7999/ws/rpc/hello", new HelloWorldRpcImpl());
    }
}
