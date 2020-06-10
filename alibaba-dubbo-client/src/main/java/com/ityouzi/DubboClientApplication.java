package com.ityouzi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: Liberal-World
 * @Date: 2020-06-07 17:20
 * @Description: 服务消费者
 * @Version 1.0
 */

@EnableDiscoveryClient
@SpringBootApplication
public class DubboClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboClientApplication.class, args);
    }





}
