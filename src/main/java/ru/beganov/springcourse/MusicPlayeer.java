package ru.beganov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class MusicPlayeer {
    //    Внедрение бина через поле
//    @Autowired
//    @Qualifier("rockMusic")
//    private Music music;

    @Value("${musicPlayeer.name}")
    private String name;
    @Value("${musicPlayeer.volume}")
    private int volume;

    private Music music1;
    private Music music2;



    public MusicPlayeer(@Qualifier("classicalMusic") Music music1,@Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }



//    Внедрение бина через конструктор
//    @Autowired
//    public MusicPlayeer(Music music) {
//        this.music = music;
//    }

    //    Внедрение бина через сеттер
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }


    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();

    }



//    public void setMusic(Music music) {
//        this.music = music;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
