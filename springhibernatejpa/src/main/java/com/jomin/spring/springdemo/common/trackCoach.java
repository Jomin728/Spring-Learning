package com.jomin.spring.springdemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/*
@Lazy
*/
@Component
public class trackCoach  implements  Coach{

    public trackCoach()
    {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @PostConstruct
    public void doSomeStartupStuff()
    {
        System.out.println("In startup constructor: " + getClass().getSimpleName());

    }
    @PreDestroy
    public void doSomeCleanUp()
    {
        System.out.println("In destroy constructor: " + getClass().getSimpleName());

    }
    @Override
    public String getDailyWorkout() {
        return "Run a 5k";
    }
}
