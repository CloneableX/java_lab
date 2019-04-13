package com.clo.ws.rest.client;

import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

/**
 * com.clo.ws.rest.client.HelloClient
 *
 * @author cloneable
 * @date 2019/4/13 18:37:13
 * @description ws rest client
 */
public class HelloClient {
    public static void main(String[] args) {
        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);
        WebTarget target = client.target(UriBuilder.fromUri("http://localhost:8080/webservice_rest").build());
        System.out.println(target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class));
        System.out.println(target.path("rest").path("hello").request().accept(MediaType.TEXT_HTML).get(String.class));
        System.out.println(target.path("rest").path("hello").request().accept(MediaType.TEXT_XML).get(String.class));
    }
}
