package com.ship.in.rest.feignclients.delhivery;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DelhiveryClientConfig {

    @Value("${services.delhivery.token:null}")
    private String token;

    @Bean
    public RequestInterceptor requestTokenBearerInterceptor() {
        return new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate requestTemplate) {
                requestTemplate.header("Authorization", token);
            }
        };
    }
}
