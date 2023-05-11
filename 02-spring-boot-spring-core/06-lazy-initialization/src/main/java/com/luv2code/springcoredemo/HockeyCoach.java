package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach{
    public HockeyCoach()
    {
        System.out.println(" In constructor = " + getClass().getSimpleName());
    }
    @Override
    public String GetDailyRoutine() {
        return "Daily Gym for 2 hours";
    }
}
