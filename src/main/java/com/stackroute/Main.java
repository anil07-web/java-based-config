package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.config.Appconfig;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        //  Using ApplicationContext
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Appconfig.class);
        Actor act=applicationContext.getBean(Actor.class);
            act.setName("Anil");
            act.setGender("Male");
            act.setAge(25);
            System.out.println(act);
        Movie mov = applicationContext.getBean("movie",Movie.class);
        System.out.println(mov);
        Movie mov1 = applicationContext.getBean("movie",Movie.class);
        System.out.println(mov==mov1);   // Scope(Singletone)->true
                                         // Scope(prototype)->false



    }
}
