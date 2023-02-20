package ru.beganov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music{
//    private ClassicalMusic() {
//    }
//
//    public static ClassicalMusic getClassicalMusic() {
//        return new ClassicalMusic();
//    }
//
//    public void doInit(){
//        System.out.println("Doing initializing...");
//    }
//
//    public void doDestroy(){
//        System.out.println("Destruction...");
//    }

    @Override
    public String getSong() {
        List<String> classics = new ArrayList<>();
        classics.add("Hungarian Rhapsody");
        classics.add("Michele Jack");
        classics.add("Antonio Banderos");
        int random = new Random().nextInt(classics.size());
        String s = classics.get(random);
        return s;
    }
}
