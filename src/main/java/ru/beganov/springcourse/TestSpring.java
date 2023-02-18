package ru.beganov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        MusicPlayeer musicPlayeer = context.getBean("musicPlayeer", MusicPlayeer.class);
//        musicPlayeer.playMusic();
//        ClassicalMusic classicalMusic = context.getBean("someRockMusic", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());
//        Music rockMusic = context.getBean("someRockMusic", Music.class);
//        MusicPlayeer musicPlayeer = new MusicPlayeer(rockMusic);
//        musicPlayeer.playMusic();
//
//        Music classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
//        MusicPlayeer musicPlayeer1 = new MusicPlayeer(classicalMusic);
//        musicPlayeer1.playMusic();
//        MusicPlayeer firstMusicPlayeer = context.getBean("musicPlayeer",MusicPlayeer.class);
//        MusicPlayeer secondMusicPlayeer = context.getBean("musicPlayeer",MusicPlayeer.class);
//
//        boolean comparison = firstMusicPlayeer == secondMusicPlayeer;
//        System.out.println(comparison);
//        System.out.println(firstMusicPlayeer);
//        System.out.println(secondMusicPlayeer);
//
//        firstMusicPlayeer.setVolume(10);
//        secondMusicPlayeer.setVolume(24);

//        System.out.println(firstMusicPlayeer.getVolume());
//        System.out.println(secondMusicPlayeer.getVolume());


//        System.out.println(musicPlayeer.getName());
//        System.out.println(musicPlayeer.getVolume());

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        context.close();
    }
}
