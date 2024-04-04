package com.example.restfetcher;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectMapper {

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
