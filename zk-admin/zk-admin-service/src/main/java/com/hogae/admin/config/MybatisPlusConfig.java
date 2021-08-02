package com.hogae.admin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.hogae.admin.mapper"})
public class MybatisPlusConfig {

}
