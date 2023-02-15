package ru.beganov.springcourse;

public class MusicPlayeer {
    private Music music;
    private String name;
    private int volume;

    public MusicPlayeer(Music music) {
        this.music = music;
    }

    public MusicPlayeer() {
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    public void setMusic(Music music) {
        this.music = music;
    }

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
