package com.ship.in.rest.feignclients.rapid;

import java.util.Arrays;
import java.util.Collections;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.form.FormEncoder;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Configuration
public class RapidClientConfig {
    
	// @Autowired
    // private ObjectFactory<HttpMessageConverters> messageConverters;

    @Bean(name = "RapidRequestInterceptor")
    public RequestInterceptor requestTokenBearerInterceptor() {
        return new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate requestTemplate) {
                requestTemplate.header("content-type", "application/json");
                requestTemplate.header("accept", "application/json");
            }
        };
    }

    @Bean
    public MappingJackson2HttpMessageConverter jackson2HttpMessageConverter() {

        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setSupportedMediaTypes(Arrays.asList(MediaType.MULTIPART_FORM_DATA, MediaType.TEXT_HTML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML));
		converter.setPrettyPrint(true);
        return converter;
    }

    @Bean
    @Primary
    @Scope(SCOPE_PROTOTYPE)
    public Encoder httpMessageConverter() {
		HttpMessageConverter jacksonConverter = new MappingJackson2HttpMessageConverter();
		ObjectFactory<HttpMessageConverters> messageConverters = () -> new HttpMessageConverters(jacksonConverter);
        return new FormEncoder(new SpringEncoder(messageConverters));

    }
}
