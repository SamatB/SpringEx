package ru.beganov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("rockMusic")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        List<String> classics = new ArrayList<>();
        classics.add("Wind cries MAry");
        classics.add("Huchy Windy");
        classics.add("Tommy Guy");
        int random = new Random().nextInt(classics.size());
        String s = classics.get(random);
        return s;
    }
}
