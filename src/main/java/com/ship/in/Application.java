package com.ship.in;

import com.ship.in.config.CustomConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
//import org.springframework.hateoas.config.EnableHypermediaSupport;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
@EnableSwagger2
@SpringBootApplication
@Import(CustomConfig.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
