package ru.beganov.springcourse;

public class ClassicalMusic implements Music{
    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doInit(){
        System.out.println("Doing initializing...");
    }

    public void doDestroy(){
        System.out.println("Destruction...");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
