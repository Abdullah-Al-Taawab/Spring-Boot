package com.luv2code.util;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String GetDailyRoutine() {
        return "Daily run for 15 minutes Atleast";
    }
}
