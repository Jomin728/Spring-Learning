package com.jomin.spring.springdemo.common;

public class swimCoach implements Coach{

    public swimCoach()
    {
        System.out.println("In constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim a 1000 meters as a warmup";
    }
}
