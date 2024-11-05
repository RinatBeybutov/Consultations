package org.example;

public class DogImpl implements Dog {

    private boolean hasHand = false;

    @Override
    public void voice() {
        System.out.println("Голос!");
    }

    @Override
    public String giveHand() {
        return "Даю лапу";
    }

    @Override
    public boolean hasHand() {
        return hasHand;
    }

    @Override
    public void setHand(boolean hasHand) {
        this.hasHand = hasHand;
    }
}
