package org.example;

import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;

public class MusicPlayer {

    private ArrayList<Music> musicList;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(ArrayList<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        return "Playning: " + musicList.get((int) (Math.random() * 3)).getSong();
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

//    //IoC
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    public MusicPlayer() {
//    }
//
//    public void setMusic(Music music) {
//        this.music = music;
//    }
//
//    /*public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }
}


