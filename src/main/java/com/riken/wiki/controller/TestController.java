package com.riken.wiki.controller;

import com.riken.wiki.domain.Test;
import com.riken.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class TestController {


    @Value("${test.hello:TEST}")
    private String testHello;

    @Resource
    private TestService testService;

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
        return "hello World" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "hello World,Post" + name;
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }


}
