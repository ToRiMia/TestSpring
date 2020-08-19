package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RockMusic implements Music{

    ArrayList<String> songs = new ArrayList<>();

    public void setSongs(){
        songs.add("Nirvana - Smells Like Teen Spirit");
        songs.add("Linkin Park - In The End");
        songs.add("Король и Шут - Мёртвый анархист");
    }

    private RockMusic() {
        setSongs();
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
        return songs.get((int)(Math.random() * 3));
    }
}
