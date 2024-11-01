package org.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "green")
public class GreenCat implements CatInterface {

    @Lazy
    private BlackCat blackCat;

    // Метод вызывается после инициализации бина!
    @PostConstruct
    public void init() {

    }


    @Override
    public void sayMeow() {
        System.out.println("Green cat meow");
    }
}
