package com.gch.yunpan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.DependsOn;

@SpringBootApplication
@MapperScan("com.gch.yunpan.mapper")
@DependsOn("flywayInitializer")
public class YunpanApplication {

    public static void main(String[] args) {
        SpringApplication.run(YunpanApplication.class, args);
    }

}
