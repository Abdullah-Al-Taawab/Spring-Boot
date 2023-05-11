package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach{
    @Override
    public String GetDailyRoutine() {
        return "Daily Gym for 2 hours";
    }
}
