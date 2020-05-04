package com.sql.controller;


//import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tt")
public class helloController {

//    @Value("${{my.prop}}")
//    private String myProp;
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
