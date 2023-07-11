package com.ey.udemy.common;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // feild injection
//    @Autowired
//    private Coach myCoach;

//    private Coach myCoach;

    //contructor injection
//    @Autowired
//    public DemoController(Coach theCoach) {
//        myCoach = theCoach;
//    }

    //setter injection
    // we can keep any name for the method
//    @Autowired
//    public void setMyCoach(Coach myCoach) {
//        this.myCoach = myCoach;
//    }

   /* @GetMapping("/dailyworkout")
    public String getDailyWorkout() {

        return myCoach.getDailyWorkout();
    }*/

}