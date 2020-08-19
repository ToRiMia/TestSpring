package org.example;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    /*private String name;
    private int volume;*/

    /*//IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }*/

    public String playMusic() {
        return "Playning: " + classicalMusic.getSong();
    }
    /*public void setMusic(Music music) {
        this.music = music;
    }

    /*public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }*/
}


