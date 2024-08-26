package com.luv2code.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseballCoach implements Coach{
    public BaseballCoach(){
        System.out.println("In "+getClass().getSimpleName() + " constructor.");
    }
    @Override
    public String getDailyWorkout() {
        return "Do some push ups! The baseball Coach says so!";
    }
}
