package ru.beganov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Computer {
    private int id;
    private MusicPlayeer musicPlayeer;


    public Computer(MusicPlayeer musicPlayeer) {
        this.id = 1;
        this.musicPlayeer = musicPlayeer;
    }

    @Override
    public String toString() {
        return "Computer: " + id + " " + musicPlayeer.playMusic();
    }
}
