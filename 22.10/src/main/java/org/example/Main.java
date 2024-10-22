package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(
            Main.class);

    // см https://examples.javacodegeeks.com/java-development/enterprise-java/slf4j/slf4j-tutorial-beginners/
    public static void main(String[] args) {
        Cat c = new Cat("C");

        for (int i = 0; i < 10; i++) {
            c.decreaseLives();
        }

        logger.info("asd");

    }
}