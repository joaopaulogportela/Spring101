package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Do some push ups! The baseball Coach says so!";
    }
}
