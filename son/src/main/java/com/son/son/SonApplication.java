package com.son.son;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;


@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(value = "com.son.son.mapper")
public class SonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SonApplication.class, args);
    }

}
