package com.jomin.springboot.demo.myfirstapp.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //expose "/" endpoint that will return hello page
    @GetMapping("/")
    public String sayHello()
    {
        return  "Hello World";
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
