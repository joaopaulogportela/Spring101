package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Lazy
public class DemoController {
    // define private field for dependency
    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach coach){
        System.out.println("In "+getClass().getSimpleName() + " constructor.");
        this.myCoach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
