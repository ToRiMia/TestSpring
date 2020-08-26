package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class RockMusic implements Music{
    public RockMusic() {
    }

    public static RockMusic getRockMusic(){
        return new RockMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialisation");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Demons";
    }
}
