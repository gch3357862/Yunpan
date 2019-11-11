package com.gch.yunpan.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.DependsOn;

@SpringBootApplication
@MapperScan(basePackages = "com.gch.yunpan.user.mapper")
@DependsOn("flywayInitializer")
public class YunpanUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(YunpanUserApplication.class, args);
	}

}