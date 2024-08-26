package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{
    @PostConstruct
    public void doStartUpStuff(){
        System.out.println("In doStartUpStuff(): " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doCleanUpStuff(){
        System.out.println("In doCleanUpStuff(): " + getClass().getSimpleName());
    }

    public CricketCoach(){
        System.out.println("In "+getClass().getSimpleName() + " constructor.");
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes. So says the CricketCoach";
    }
}
