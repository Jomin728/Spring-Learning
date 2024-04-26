package com.jomin.springboot.demo.myfirstapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //expose "/" endpoint that will return hello page
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHello()
    {
        return  "Hello World";
    }

    @GetMapping("/teamInfo")
    public String teamInfo()
    {
        return  "Hello Team" + teamName + "I am your coach" + coachName ;
    }

    //expose a new endpoint for workout
    @GetMapping("/workout")
    public  String dailyWorkOut()
    {
        return "Run a hard 9K!";
    }
    @GetMapping("/courses")
    public  String newCourse()
    {
        return "Take new course!";
    }


}
