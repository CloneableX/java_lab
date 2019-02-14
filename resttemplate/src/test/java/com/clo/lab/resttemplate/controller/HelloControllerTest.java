package com.clo.lab.resttemplate.controller;

import com.clo.lab.resttemplate.TestBase;
import com.clo.lab.resttemplate.entity.User;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class HelloControllerTest extends TestBase {
    private RestTemplate restTemplate = new RestTemplate();

    @Test
    public void testGetHello() {
        ResponseEntity<String> entity = restTemplate.getForEntity("http://localhost:8080/hello/say", String.class);
        System.err.println(entity.getBody());
    }

    @Test
    public void testHelloUser() {
        ResponseEntity<String> entity = restTemplate.getForEntity("http://localhost:8080/hello/user?username=cloneable", String.class);
        System.err.println(entity.getBody());
    }

    @Test
    public void testGetUserByObject() {
        User user = restTemplate.getForObject("http://localhost:8080/hello/user/{id}", User.class, 1L);
        System.err.println(user);
    }

    @Test
    public void testGetUser() {
        ResponseEntity<User> entity = restTemplate.getForEntity("http://localhost:8080/hello/user/{id}", User.class, 1L);
        System.err.println(entity.getBody());
    }

    @Test
    public void testSave() {
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("username", "xu");
        paramsMap.put("id", 10L);

        HttpEntity entity = new HttpEntity(paramsMap);
        String responseStr = restTemplate.postForObject("http://localhost:8080/hello/save", entity, String.class);
        System.err.println(responseStr);
    }
}
