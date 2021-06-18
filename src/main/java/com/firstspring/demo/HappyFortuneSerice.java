package com.firstspring.demo;

public class HappyFortuneSerice implements FortuneService {
    @Override
    public String getFortune(){
        return "Today is your lucky day!!!";
    }

}
