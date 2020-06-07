package com.ci.helloword.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CIController {

    @RequestMapping("/hello")
    public  String hello(){
        System.out.println("fixme");

        System.out.println("333");
        System.out.println("你号哦");
        System.out.println("你号啊");
        System.out.println("我不追到");
        return  "hello Word";
    }


    @RequestMapping("/hello2")
    public  String sayHello2(){


        System.out.println("helo2");

        return  "Hello Word2";
    }
}
