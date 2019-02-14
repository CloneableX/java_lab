package com.clo.lab.resttemplate.controller;

import com.clo.lab.resttemplate.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping("say")
    @ResponseBody
    public String say() {
        return "hello";
    }

    @GetMapping("user")
    public String helloUser(String username) {
        return "hello " + username;
    }

    @GetMapping("user/{id}")
    @ResponseBody
    public User getUser(@PathVariable String id) {
        User user = new User();
        user.setId(1L);
        user.setUsername("cloneable");
        return user;
    }

    @PostMapping("save")
    public String save(@RequestBody User user) {
        System.err.println(user);
        return "保存成功！";
    }
}
