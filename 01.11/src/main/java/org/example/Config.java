package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    //Когда мы используем сторонние бибилиотеки!
    @Bean
    public Mouse Mymouse() {
        return new Mouse();
    }

}
