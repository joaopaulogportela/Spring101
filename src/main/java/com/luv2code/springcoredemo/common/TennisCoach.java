package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach{
    public TennisCoach(){
        System.out.println("In "+getClass().getSimpleName() + " constructor.");
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 10km. So does the TennisCoach say.";
    }
}
