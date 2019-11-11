package com.gch.yunpan.file;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.DependsOn;

@SpringBootApplication
@MapperScan(basePackages = "com.gch.yunpan.file.mapper")
@DependsOn("flywayInitializer")
public class YunpanFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(YunpanFileApplication.class, args);
	}

}