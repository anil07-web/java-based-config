package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {

    //    bean for Actor
    @Bean
    public Actor actor() {
        return new Actor();
    }

    //    bean for Movie
    @Bean
    public Movie movie() {
        return  new Movie();
    }
}
