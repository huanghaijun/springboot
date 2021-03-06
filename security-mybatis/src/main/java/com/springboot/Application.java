package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by wanglu-jf on 17/8/17.
 */
@SpringBootApplication
@ComponentScan(value = {"com.springboot.controller","com.springboot.config","com.springboot.service","com.springboot.filters"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
