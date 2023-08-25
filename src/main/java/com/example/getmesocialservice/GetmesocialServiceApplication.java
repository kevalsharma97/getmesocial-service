package com.example.getmesocialservice;

import jdk.jfr.Enabled;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@SpringBootApplication
@SpringBootApplication(exclude ={MongoAutoConfiguration.class})
//@SpringBootApplication(exclude ={MongoAutoConfiguration.class, MongoRepositoriesAutoConfiguration.class,MongoDataAutoConfiguration.class})
@EnableSwagger2
//@EnableMongoRepositories("com.example.getmesocialservice.repository")
//@ComponentScan("com.example.getmesocialservice.repository")
public class GetmesocialServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetmesocialServiceApplication.class, args);
	}

}
