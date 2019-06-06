package com.exam.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.exam.demo.mapper")  
public class SpringbootTestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTestDemoApplication.class, args);
	}

}
