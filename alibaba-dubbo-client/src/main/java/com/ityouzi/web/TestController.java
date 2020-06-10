package com.ityouzi.web;

import com.ityouzi.api.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Liberal-World
 * @Date: 2020-06-07 17:21
 * @Description:
 * @Version 1.0
 */
@RestController
public class TestController {

    // 这里的@Reference注解是org.apache.dubbo.config.annotation.Reference
    @Reference
    HelloService helloService;


    @GetMapping("/test")
    public String test(){
        return helloService.hello("ityouzi.com");
    }
}
