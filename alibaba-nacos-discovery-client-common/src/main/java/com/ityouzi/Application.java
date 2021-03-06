package com.ityouzi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


/**
 * @Auther: Liberal-World
 * @Date: 2020-06-01 16:25
 * @Description:
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    /**
     * localhost:9000/test
     */
//    @Slf4j
//    @RestController
//    static class TestController{
//        @Autowired
//        LoadBalancerClient loadBalancerClient;
//
//        @GetMapping("/test")
//        public String test(){
//            // 通过spring cloud common中的负载均衡接口选取服务提供节点实现接口调用
//            // 这里使用了Spring Cloud Common中的LoadBalancerClient接口来挑选服务实例信息。然后从挑选出的实例信息中获取可访问的URI，拼接上服务提供方的接口规则来发起调用。
//            ServiceInstance serviceInstance = loadBalancerClient.choose("alibaba-nacos-discovery-server");
//            String url = serviceInstance.getUri() + "/hello?name=" + "ityouzi";
//            RestTemplate restTemplate = new RestTemplate();
//            String result = restTemplate.getForObject(url, String.class);
//            return "Invoke : " + url + ", return : " + result;
//        }
//
//    }



    /**
     * RestTemplate
     */
//    @Slf4j
//    @RestController
//    static class TestController{
//        @Autowired
//        RestTemplate restTemplate;
//
//        @GetMapping("/test")
//        public String test(){
//            String result = restTemplate.getForObject("http://alibaba-nacos-discovery-server/hello?name=ityouzi", String.class);
//            return "Result: " + result;
//        }
//    }

//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate(){
//        return new RestTemplate();
//    }

    /**
     * WebClient
     */
    @Slf4j
    @RestController
    static class TestController{

        @Autowired
        private WebClient.Builder webClientBuilder;


        @GetMapping("/test")
        public Mono<String> test(){
            Mono<String> result = webClientBuilder.build()
                    .get()
                    .uri("http://alibaba-nacos-discovery-server/hello?name=didi")
                    .retrieve()
                    .bodyToMono(String.class);
            return result;
        }
    }


    @Bean
    @LoadBalanced
    public WebClient.Builder loadBalancedWebClientBuilder(){
        return WebClient.builder();
    }








}
