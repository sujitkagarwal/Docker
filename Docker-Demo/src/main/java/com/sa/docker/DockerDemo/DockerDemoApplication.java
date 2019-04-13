package com.sa.docker.DockerDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}
}

@RestController
class TestController{


	@GetMapping("/hello")
	String getHello(){
		return "Hello I am in kubernates with docker";
	}


	@GetMapping("/hello1")
	String getHello1(){
		return "Hello I am in kubernates with docker 111";
	}
}