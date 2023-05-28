package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean
    public Coach SwimCoach()
    {
        return new SwimCoach();
    }
}
