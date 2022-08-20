package com.riken.wiki.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan("com.riken")
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

    @RequestMapping("/hello")
    public String hello(){
        return "hello World";
    }

}
