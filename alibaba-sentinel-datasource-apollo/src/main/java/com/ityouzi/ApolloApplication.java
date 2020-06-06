package com.ityouzi;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Liberal-World
 * @Date: 2020-06-05 14:12
 * @Description:
 * @Version 1.0
 */
@EnableApolloConfig   // 开启Apollo的配置加载功能
@SpringBootApplication
public class ApolloApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApolloApplication.class, args);
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
