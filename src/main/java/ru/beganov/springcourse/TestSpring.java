package ru.beganov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayeer musicPlayeer = new MusicPlayeer(music);

        MusicPlayeer firstMusicPlayeer = context.getBean("musicPlayeer",MusicPlayeer.class);
        MusicPlayeer secondMusicPlayeer = context.getBean("musicPlayeer",MusicPlayeer.class);

        boolean comparison = firstMusicPlayeer == secondMusicPlayeer;
        System.out.println(comparison);
        System.out.println(firstMusicPlayeer);
        System.out.println(secondMusicPlayeer);

        firstMusicPlayeer.setVolume(10);
        secondMusicPlayeer.setVolume(24);
//        musicPlayeer.playMusic();
        System.out.println(firstMusicPlayeer.getVolume());
        System.out.println(secondMusicPlayeer.getVolume());


//        System.out.println(musicPlayeer.getName());
//        System.out.println(musicPlayeer.getVolume());
        context.close();
    }
}
