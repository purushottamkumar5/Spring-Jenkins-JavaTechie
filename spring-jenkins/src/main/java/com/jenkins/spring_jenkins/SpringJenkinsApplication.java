package com.jenkins.spring_jenkins;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@SpringBootApplication
@Slf4j
@RestController
public class SpringJenkinsApplication {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void init()
	{
		log.info("Application Started ................");
	}
	@GetMapping
	public String getHealth()
	{
		return "OK";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
