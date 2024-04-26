package com.jomin.spring.springdemo.common;


import com.jomin.spring.springdemo.common.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class cricketCoach implements Coach {
    public cricketCoach()
    {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practise fast bowling for 25 minutes !!!";
    }
}
