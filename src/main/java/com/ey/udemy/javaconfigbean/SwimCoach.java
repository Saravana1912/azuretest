package com.ey.udemy.javaconfigbean;

import com.ey.udemy.common.Coach;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());

    }

    @Override
    public String getDailyWorkout() {
        return "Saravana Spend 30 minutes in swimming practice Daily";
    }
}
