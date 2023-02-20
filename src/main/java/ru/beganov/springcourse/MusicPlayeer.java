package ru.beganov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayeer {
    //    Внедрение бина через поле
//    @Autowired
//    @Qualifier("rockMusic")
//    private Music music;

    private Music music1;
    private Music music2;


    @Autowired
    public MusicPlayeer(@Qualifier("classicalMusic") Music music1,@Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    private String name;
    private int volume;

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

}
