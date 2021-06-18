package com.firstspring.demo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Work Hard Play Hard";
    }

    // setter method for dependency injention
    public void setfortuneService(FortuneService mycricketfortune) {
        System.out.println(" Create get inside the criket class setter");
        this.fortuneService = mycricketfortune;
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }
}
