package com.ci.helloword.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CIController {

    @RequestMapping("/hello")
    public  String hello(){
        System.out.println("fixme");

        return  "hello Word";
    }
}
