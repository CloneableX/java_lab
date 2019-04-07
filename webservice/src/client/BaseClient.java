package com.clo.ws.client;

import com.clo.ws.rpc.server.HelloWorldRpc;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * com.clo.ws.client.BaseClient
 *
 * @author Cloneable
 * @date 2019/4/5 13:35:05
 * @description basic web service client
 */
public class BaseClient<T extends HelloWorldRpc> {
    protected String url;
    protected Class<T> serviceClazz;
    private T service;

    public BaseClient(String url, Class<T> serviceClazz) {
        this.url = url;
        this.serviceClazz = serviceClazz;
    }

    protected T createService() throws MalformedURLException {
        if(url == null || "".equals(url)) {
            return null;
        }

        URL serviceUrl = new URL(url);

        QName qName = new QName("http://server.rpc.ws.clo.com/", "HelloWorldRpcImplService");
        Service service = Service.create(serviceUrl, qName);
        this.service = service.getPort(serviceClazz);
        return this.service;
    }

    protected T getService() throws MalformedURLException {
        return service != null ? service : createService();
    }
}
