package ru.beganov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayeer {
    //    Внедрение бина через поле
//    @Autowired
//    private Music music;
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayeer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
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
        return "Playing: " + classicalMusic.getSong();

    }

//    public void setMusic(Music music) {
//        this.music = music;
//    }

}
