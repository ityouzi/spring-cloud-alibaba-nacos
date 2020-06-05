package com.ityouzi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Liberal-World
 * @Date: 2020-06-01 17:23
 * @Description:
 * @Version 1.0
 */

@SpringBootApplication
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }


    @Slf4j
    @RestController
    @RefreshScope               // 主要用来让这个类下的配置内容支持动态刷新
    static class TestController{

        @Value("${didispace.title:}")
        private String title;

        @GetMapping("/test")
        public String test(){
            log.info("配置文件信息："+title);
            return title;
        }

    }

}
