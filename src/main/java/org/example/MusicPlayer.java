package org.example;

public class MusicPlayer {
    private Music music;

    private String name;
    private int volume;

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void playMusic() {
        System.out.println("Playning: " + music.getSong());
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setName(String name) {
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
    }
}


