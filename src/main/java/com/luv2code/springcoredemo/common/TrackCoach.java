package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements Coach {
    public TrackCoach(){
        System.out.println("In "+getClass().getSimpleName() + " constructor.");
    }
    @Override
    public String getDailyWorkout() {
        return "Study the maps of todays track.";
    }
}
