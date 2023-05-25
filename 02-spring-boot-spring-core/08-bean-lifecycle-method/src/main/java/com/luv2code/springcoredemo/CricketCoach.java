package com.luv2code.springcoredemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach()
    {
        System.out.println(" In constructor = " + getClass().getSimpleName());
    }
    @Override
    public String GetDailyRoutine() {
        return "Daily batting practice for 2 hours";
    }
}
