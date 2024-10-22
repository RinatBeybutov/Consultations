package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
public class Cat {

    private String name;

    private int livesCount = 9;

    public Cat(String name) {
        this.name = name;
    }

    public void decreaseLives() {
        if(livesCount == 0) {
            log.error("Cat is dead!");
        } else {
            livesCount--;
            //log.info("Lives has decreased!");
            MyLogger.info("Lives has decreased!");
        }
    }
}
