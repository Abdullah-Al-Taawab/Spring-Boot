package com.luv2code.springcoredemo;

public class SwimCoach implements Coach{


    public SwimCoach()
    {
        System.out.println("In constructor : " + getClass().getSimpleName());
    }
    @Override
    public String GetDailyRoutine() {
        return "Swim for 2 hours every day";
    }
}
