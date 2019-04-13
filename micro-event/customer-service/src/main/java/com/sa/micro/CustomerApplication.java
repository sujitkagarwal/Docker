package com.sa.micro;

import com.sa.micro.entity.User;
import com.sa.micro.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
@EnableEurekaClient
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(UserRepository repo) {
        return args -> {
            repo.save(new User(UUID.randomUUID().toString(),UUID.randomUUID().toString(),UUID.randomUUID().toString(),UUID.randomUUID().toString()));
        };
    }
}

