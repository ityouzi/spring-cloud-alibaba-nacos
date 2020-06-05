package com.ityouzi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Liberal-World
 * @Date: 2020-06-05 11:43
 * @Description:
 * @Version 1.0
 */
@SpringBootApplication
public class SentinelDataApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SentinelDataApplication.class, args);
    }


    @Slf4j
    @RestController
    static class TestController{
        @GetMapping("/hello")
        public String hello(){
            return "ityouzi.com";
        }

    }
    
    
}
