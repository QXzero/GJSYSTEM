package com.shi.gjsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan(value = "com.shi.gjsystem.mapper")
public class GjsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(GjsystemApplication.class, args);
    }

}
