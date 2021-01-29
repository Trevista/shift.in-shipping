package com.ship.in.rest.feignclients.Dotzot;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DotzotClientConfig {

    @Value("${services.dotzot.token:null}")
    private String token;

    @Bean(name = "DotzotRequestInterceptor")
    public RequestInterceptor requestTokenBearerInterceptor() {
        return new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate requestTemplate) {
                requestTemplate.header("Content-type", "application/json");
            }
        };
    }
}
