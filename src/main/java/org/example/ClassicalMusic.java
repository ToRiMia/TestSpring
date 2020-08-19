package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component
public class ClassicalMusic implements Music{
    ArrayList <String> songs = new ArrayList<>();

    public ClassicalMusic() {
        setSongs();
    }

    public void setSongs(){
        songs.add("Бах - Токката");
        songs.add("Шуберт - Аве Мария");
        songs.add("Бетховен - К Элизе - Лунная соната");
    }

    @Override
    public String getSong() {
        return songs.get((int)(Math.random() * 3));
    }
}
