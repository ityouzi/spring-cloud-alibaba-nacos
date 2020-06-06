package com.ityouzi.controller;

import com.ityouzi.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Auther: Liberal-World
 * @Date: 2020-06-05 16:01
 * @Description:
 * @Version 1.0
 */
@RestController
public class TestController {



    @Autowired
    private TestService service;



    @GetMapping("/hello")
    public String hello(){
        service.doSomeThing("hello" + new  Date());
        return "ityouzi.com";
    }


    @GetMapping("/hello2")
    public String hello2(){
        service.doSomeThing2("hello2" + new Date());
        return "ityouzi.com2";
    }

}
