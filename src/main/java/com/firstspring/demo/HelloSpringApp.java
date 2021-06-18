package com.firstspring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpringApp {

    public static void main(String[] args) {

        // Load teh spring cofigration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // Retrive the beam for Spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // Call method of beam
        System.out.println(theCoach.getDailyWorkout());

        // Call forturn method of beam
        System.out.println(theCoach.getDailyFortune());

        // Close the context
        context.close();
    }
}
