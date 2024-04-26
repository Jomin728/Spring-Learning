package com.jomin.spring.springdemo.rest;

import com.jomin.spring.springdemo.common.Coach;
import com.jomin.spring.springdemo.common.trackCoach;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
  //define a private field for the dependency
    private Coach myCoach;
    private Coach anotherCoach;

    private Coach trackCoach;

    // define a constructor for dependency injection
//    @Autowired
//    public DemoController(Coach thecoach)
//    {
//        myCoach=thecoach;
//    }

  //example of field injection
//  @Autowired
//  private Coach mycoach;

  @Autowired
  public void setCoach(@Qualifier("baseBallcoach") Coach thecoach,@Qualifier("baseBallcoach") Coach anotherCoach)
  {
    myCoach=thecoach;
    this.anotherCoach=anotherCoach;

  }

  @Autowired
  public DemoController(@Qualifier("trackCoach")Coach thecoach)
    {
        trackCoach=thecoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }
    @GetMapping("/check")
    public  String  checkBeans()
    {
//      return anotherCoach.getDailyWorkout() + "||||" + myCoach.getDailyWorkout();
        return  "Comparing beans "+anotherCoach.equals(myCoach) + "?";
    }
}
