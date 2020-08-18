package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music classicalMusic = context.getBean("classicalMusic", Music.class);
        Music rockMusic = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer1 = new MusicPlayer(classicalMusic);
        musicPlayer1.playMusic();
        MusicPlayer musicPlayer2 = new MusicPlayer(rockMusic);
        musicPlayer2.playMusic();

        /*MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        //System.out.println("Name of player: " + musicPlayer.getName());
        musicPlayer2.setVolume(35);
        System.out.println("Volume 1: " + musicPlayer1.getVolume());
        System.out.println("Volume 2: " + musicPlayer2.getVolume());*/

        context.close();

    }
}
