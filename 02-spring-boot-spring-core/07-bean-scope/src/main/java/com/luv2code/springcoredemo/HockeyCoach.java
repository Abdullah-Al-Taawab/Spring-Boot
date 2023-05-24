package com.luv2code.springcoredemo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
