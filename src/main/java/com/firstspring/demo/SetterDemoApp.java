package com.firstspring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // retrieve bean for spring container
        Coach coach = context.getBean("myCricketCoach", Coach.class);

        // call methods for beam
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyWorkout());
        // close the context
        context.close();
    }
}
