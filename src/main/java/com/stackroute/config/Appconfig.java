package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Appconfig {

    //    bean for Actor
    @Bean
    public Actor actor() {
        return new Actor();
    }

    //    bean for Movie
    @Bean
    @Scope(value="prototype")
    public Movie movie() {
        return  new Movie();
    }
}
