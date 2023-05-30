package com.way;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 生产者
 * 使用tomcat容器和web组件开发，该容器支持多个三方应用，亲测如果使用webflux则无法使用springdoc
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.way.mapper")
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
