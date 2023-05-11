package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements  Coach{

    public FootballCoach()
    {
        System.out.println(" In constructor = " + getClass().getSimpleName());
    }
    public String GetDailyRoutine() {
        return "Daily run for 15 minutes";
    }

}
