package com.jomin.spring.springdemo.common;

import org.springframework.stereotype.Component;

@Component
public class tennisCoach implements Coach{
    public tennisCoach()
    {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 45 mins in practise";
    }
}
