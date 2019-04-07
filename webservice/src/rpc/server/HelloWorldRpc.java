package com.clo.ws.rpc.server;

import com.clo.ws.rpc.server.entity.Fruit;
import com.clo.ws.rpc.server.entity.Response;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * com.clo.ws.rpc.server.HelloWorldRpc
 *
 * @author Cloneable
 * @date 2019/4/5 11:55:05
 * @description service interface for web service server by RPC type
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWorldRpc {
      @WebMethod
      @WebResult(name = "helloStr")
      String getHelloWorldString(@WebParam(name = "name") String name);

      @WebMethod
      @WebResult(name = "fruitResp")
      Response getFruit(@WebParam(name = "name") String name, @WebParam(name = "color") Fruit.Color color);
}
