package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String GetDailyRoutine() {
        return "Daily batting practice for 2 hours";
    }
}
