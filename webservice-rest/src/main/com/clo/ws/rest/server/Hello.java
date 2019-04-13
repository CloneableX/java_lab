package com.clo.ws.rest.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * com.clo.ws.rest.server.Hello
 *
 * @author Cloneable
 * @date 2019/4/13 17:22:13
 * @description ws REST first server
 */
@Path("/hello")
public class Hello {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHelloTxt() {
        return "Hello REST Txt";
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHelloHtml() {
        return "<html><title>Hello REST</title><body><h1>Welcome use REST</h1></body></html>";
    }

    @GET
    @Produces(MediaType.TEXT_XML)
    public String getHelloXml() {
        return "<?xml version=\"1.0\"?><hello>Hello REST</hello>";
    }
}
