package org.example;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    private RockMusic() {
    }

    public static RockMusic getRockMusic(){
        return new RockMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialisation");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Demons";
    }
}
