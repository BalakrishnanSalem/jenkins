package com.example.Jenkinsexp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsexpApplication {

	public static Logger log = LoggerFactory.getLogger(JenkinsexpApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JenkinsexpApplication.class, args);
		log.info("Application started....");
	}
}
