package com.luv2code.springcoredemo.common;

import java.security.PublicKey;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("In "+getClass().getSimpleName()+" constructor");
    }
    @Override
    public String getDailyWorkout() {
        return "The swim coach says: SWIN 250M IN LESS THAN ONE MINUTE!";
    }
}
