package com.ey.udemy.beanlifecycle;

import com.ey.udemy.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanLifeCycleController {
    private Coach myCoach;


    @Autowired
    public BeanLifeCycleController(@Qualifier("tennisCoach") Coach theCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkoutone")
    public String getDailyWorkoutTest() {
        return myCoach.getDailyWorkout();
    }

}
