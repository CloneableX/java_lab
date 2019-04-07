package com.clo.ws.rpc.server;

import com.clo.ws.rpc.server.entity.Fruit;
import com.clo.ws.rpc.server.entity.Response;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * com.clo.ws.rpc.server.HelloWorldRpcImpl
 *
 * @author Cloneable
 * @date 2019/4/5 13:17:05
 * @description
 */
@WebService(endpointInterface = "com.clo.ws.rpc.server.HelloWorldRpc")
public class HelloWorldRpcImpl implements HelloWorldRpc {
    @Override
    public String getHelloWorldString(String name) {
        return "Hello WS RPC " + name;
    }

    @Override
    public Response getFruit(String name, Fruit.Color color) {
        Fruit fruit = new Fruit(name, color);
        return new Response<Fruit>().getSuccessResp(fruit);
    }
}
