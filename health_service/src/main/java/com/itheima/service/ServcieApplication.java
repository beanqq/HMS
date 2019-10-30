package com.itheima.service;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ServcieApplication {

    public static void main(String[] args) {
         new SpringApplicationBuilder(ServcieApplication.class)
                .web(WebApplicationType.NONE) // 非 Web 应用
                .run(args);
        ;

    }
}
