package com.hogae.admin;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableWebMvc
@EnableOpenApi
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.hogae.admin.web")
@PropertySource("classpath:dubbo-consumer.properties")
@ComponentScan(value = {"com.hogae.admin.web"})
public class ZkAdminWebApplication {


    public static void main(String[] args) {
        SpringApplication.run(ZkAdminWebApplication.class, args);
    }
}
