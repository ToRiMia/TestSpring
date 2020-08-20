package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class RockMusic implements Music{
    private RockMusic() {
    }

    public static RockMusic getRockMusic(){
        return new RockMusic();
    }

    @PostConstruct
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
