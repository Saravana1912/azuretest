package com.ey.javaconfigbean;

import com.ey.udemy.Coach;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());

    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in swimming practice";
    }
}
