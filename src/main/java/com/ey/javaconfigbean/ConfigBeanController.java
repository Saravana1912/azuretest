package com.ey.javaconfigbean;

import com.ey.udemy.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigBeanController {
    private Coach myCoach;


    @Autowired
    public ConfigBeanController(@Qualifier("swimCoach") Coach theCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkouts")
    public String getDailyWorkoutTest() {
        return myCoach.getDailyWorkout();
    }

}
