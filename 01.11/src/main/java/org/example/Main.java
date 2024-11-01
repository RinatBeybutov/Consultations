package org.example;

import org.example.beans.CatInterface;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * 1. xml
         * 2. annotations
         * 3. configuration
         */

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Dog.class, Config.class);
                //GreenCat.class, BlackCat.class);

        context.refresh();

        context.scan("");

        Dog bean = context.getBean(Dog.class);
        Mouse mouse = context.getBean(Mouse.class);

        CatInterface cat = context.getBean(CatInterface.class);
        //GreenCat greenCat = context.getBean(GreenCat.class);

        //Object greenCat1 = context.getBean("green", CatInterface.class);

        /**
         *  1. @Primary - какой-то бин по умолчанию выбираться для внедрения
         *  2. @Qualifier - именование бинов, чтобы вызывать по имени
         */

        cat.sayMeow();

        for (String name : context.getBeanDefinitionNames()) {
            //System.out.println(name);
        }

        System.out.println();

        context.close();

    }
}