package com.sa.micro.edge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Authur : sujitagarwal
 * Created: 12/04/19.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class EdgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EdgeApplication.class, args);

    }


}
