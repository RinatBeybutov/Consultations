package org.example;

import org.springframework.stereotype.Component;

@Component
//@Repository
//@Service
//@Controller
public class Dog {

    private String name = "Dog";

    public String getName() {
        return name;
    }
}
