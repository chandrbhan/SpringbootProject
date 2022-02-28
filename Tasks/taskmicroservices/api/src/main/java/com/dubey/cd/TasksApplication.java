package com.dubey.cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.dubey.cd")
@EntityScan(basePackages = "com.dubey.cd")
@Configuration
@EnableJpaRepositories(basePackages = "com.dubey.cd")
public class TasksApplication {
    public static void main(String[] args){
        SpringApplication.run(TasksApplication.class);
    }
}
