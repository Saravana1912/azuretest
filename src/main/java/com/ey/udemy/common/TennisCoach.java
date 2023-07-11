package com.ey.udemy.common;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    //define init method
    @PostConstruct
    public void doStartupStuff(){
        System.out.println("In my doStartupStuff method:  "+ getClass().getSimpleName());
    }

    //define init method
    @PreDestroy
    public void doCleanupStuff(){
        System.out.println("In my doCleanupStuff method:  "+ getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}