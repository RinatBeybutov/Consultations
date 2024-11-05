package org.example;

public class DogProxy implements Dog {

    private final Dog dog;

    public DogProxy(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void voice() {
        dog.voice();
    }

    @Override
    public String giveHand() {
        if (dog.hasHand()) {
            return dog.giveHand();
        }
        return "Error, no hand";
    }

    @Override
    public boolean hasHand() {
        return dog.hasHand();
    }

    @Override
    public void setHand(boolean hasHand) {
        dog.setHand(hasHand);
    }
}
