package com.javayh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value = "com.javayh.mapper")
@SpringBootApplication
public class BootMpApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootMpApplication.class, args);
    }
}
