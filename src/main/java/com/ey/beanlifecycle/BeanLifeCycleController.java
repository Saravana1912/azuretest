package com.ey.beanlifecycle;

import com.ey.udemy.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;

public class BeanLifeCycleController {
    private Coach myCoach;


    @Autowired
    public BeanLifeCycleController(@Qualifier("tennisCoach") Coach theCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkoutTest() {
        return myCoach.getDailyWorkout();
    }

}
