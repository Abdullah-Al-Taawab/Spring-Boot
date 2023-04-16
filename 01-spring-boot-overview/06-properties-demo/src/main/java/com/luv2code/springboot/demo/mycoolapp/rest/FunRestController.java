package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose "/" that return "This is demo"
    @Value("${coach.name}")
    private String CoachName;
    @Value("${team.name}")
    private String TeamName;
    @GetMapping("/teaminfo")

    public  String teaminfo()
    {
        return " Team Name = "+TeamName+" Coach Name = "+CoachName;
    }
    @GetMapping("/")
    public String GetHello()
    {
        return "This is just demo";
    }

    //expose a new endpoint for "workout "
    @GetMapping("/workout")
    public String getdailyworkout()
    {
        return "Run everyday!";
    }

    @GetMapping("/fortune")
    public String getdailyfortune()
    {
        return "Every Day is yours if you work hard";
    }




}
