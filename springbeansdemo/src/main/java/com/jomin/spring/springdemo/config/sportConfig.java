package com.jomin.spring.springdemo.config;

import com.jomin.spring.springdemo.common.Coach;
import com.jomin.spring.springdemo.common.swimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class sportConfig {

    @Bean
    public Coach swimCoach()
    {
        return new swimCoach();
    }
}
