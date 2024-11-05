package org.example;

public class CacheProxyMouse extends Mouse {

    private final Mouse mouse;

    private int cachedAge = -1;

    public CacheProxyMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public int getAge() {
        if(cachedAge == -1) {
            cachedAge = mouse.getAge();
        } else {
            System.out.println("Беру возраст из кэша!");
        }
        return cachedAge;
    }

    @Override
    public void decreaseAge() {
        mouse.decreaseAge();
        cachedAge = -1;
    }
}
