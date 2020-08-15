package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musiclist = new ArrayList<Music>();

    private int volume;

    //IoC
    public MusicPlayer(List<Music> musiclist) {
        this.musiclist = musiclist;
    }

    public MusicPlayer() {
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setMusic(List<Music> musiclist) {
        this.musiclist = musiclist;
    }

    public void playMusic() {
        for (Music song : musiclist) {
            System.out.print("Playing: " + song.getSong());
            System.out.println(" Actor: " + song.getActor());
        }
    }
}
