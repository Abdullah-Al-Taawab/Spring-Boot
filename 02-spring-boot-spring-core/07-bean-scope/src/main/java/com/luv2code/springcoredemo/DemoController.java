package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private field for the dependency
    private Coach myCoach;
    private Coach anotherCoach;
    //define a constructor for dependency injection

    @Autowired
    public DemoController(@Qualifier("hockeyCoach") Coach theCoach
    , @Qualifier("hockeyCoach") Coach theanotherCoach)
    {
        System.out.println(" In constructor = " + getClass().getSimpleName());
        myCoach= theCoach;
        anotherCoach=theanotherCoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout()
    {
     return myCoach.GetDailyRoutine();
    }

    @GetMapping("/check")
    public String check()
    {
        return "Comparing Beans between myCoach==anotherCoach   :   " + (myCoach==anotherCoach) ;
    }
    

}
