package com.riken.wiki.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class TestController {

    /*
     GET， POST， PUT, DELETE

     /user?id=1
     /user/1  restful

     @GetMapping("/hello")
     @PostMapping
     @PutMappping
     @DeleteMapping
     @RequestMapping(value="/user/1 , method = RequestMethod.Get)
     */

    @GetMapping("/hello")
    public String hello(){
        return "hello World";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "hello World,Post" + name;
    }

}
