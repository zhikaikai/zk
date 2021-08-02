package com.hogae.admin.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDubbo(scanBasePackages = {"com.hogae.admin.service"})
public class DubboConfiguration {

}
