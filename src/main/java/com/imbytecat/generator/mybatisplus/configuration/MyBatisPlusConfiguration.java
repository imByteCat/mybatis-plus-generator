package com.imbytecat.generator.mybatisplus.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.imbytecat.generator.mybatisplus.dao")
public class MyBatisPlusConfiguration {
}
