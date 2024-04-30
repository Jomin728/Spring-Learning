package com.jomin.springboot.springrest.restcontroller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class demoRestController {
    @GetMapping("/hello")
    public String sayyHello()
    {
        return "Hello World";
    }
}
