package ru.beganov.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Спринг конфигурация с помощью java кода
@Configuration
//@ComponentScan("ru.beganov.springcourse")
@PropertySource("classpath:musicPlayeer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public MusicPlayeer musicPlayeer() {
        return new MusicPlayeer(classicalMusic(), rockMusic());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayeer());
    }
}
