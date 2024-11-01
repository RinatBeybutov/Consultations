package org.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.example.Dog;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BlackCat implements CatInterface, InitializingBean {

    private Dog dog;
    private GreenCat greenCat;


    public BlackCat(Dog dog, GreenCat greenCat) {
        this.greenCat = greenCat;
        System.out.println("Constructor black cat");
        this.dog = dog;
    }

    //init-method
    // Метод вызывается после инициализации бина!
    @PostConstruct
    public void init() {
        System.out.println("Init method black cat");
    }

    @Override
    public void sayMeow() {
        System.out.println("Black cat meow");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("ater properties set");
    }
}
