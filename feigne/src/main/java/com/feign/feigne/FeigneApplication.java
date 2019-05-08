package com.feign.feigne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients("com.feign.feigne.client")

public class FeigneApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeigneApplication.class, args);
    }

}
