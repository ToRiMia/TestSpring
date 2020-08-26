package org.example;

import com.google.inject.internal.util.Lists;
import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:MusicPlayer.properties")
public class SpringConfig {

    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusicBean(){
        return new ClassicalMusic();
    }

    @Bean
    @Scope("prototype")
    public RockMusic rockMusicBean(){
        return new RockMusic();
    }

    @Bean
    @Scope("prototype")
    public PopMusic popMusicBean(){
        return new PopMusic();
    }

    @Bean
    @Scope("prototype")
    public ArrayList<Music> musicList() {
        return Lists.newArrayList(popMusicBean(), classicalMusicBean(),rockMusicBean());
    }

    @Bean
    @Scope("prototype")
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }
}
