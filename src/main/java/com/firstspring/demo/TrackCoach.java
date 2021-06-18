package com.firstspring.demo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;
    TrackCoach(FortuneService thefortuneservice){
        fortuneService = thefortuneservice;
    }

    @Override
    public String getDailyWorkout() {
        return "Run hard for 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
