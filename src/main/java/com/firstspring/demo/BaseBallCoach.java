package com.firstspring.demo;

public class BaseBallCoach implements Coach {
    // define private field for dependency
    private FortuneService fortuneService;

    BaseBallCoach(FortuneService thefortuneService){
        fortuneService = thefortuneService ;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 min for baat practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
