package com.luv2code.springcoredemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach{
    public HockeyCoach()
    {
        System.out.println(" In constructor = " + getClass().getSimpleName());
    }


    //define our init method
    @PostConstruct
    public void DoMystartupstuff()
    {
        System.out.println(" InIt method " + getClass().getSimpleName());
    }

@PreDestroy
    public void DoMyDestroyStuff()
    {
        System.out.println(" Destroy method " + getClass().getSimpleName());
    }


    @Override
    public String GetDailyRoutine() {
        return "Daily Gym for 2 hours";
    }
}
