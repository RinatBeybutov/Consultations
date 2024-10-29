package org.example;

public class Owner implements Cloneable{

    private String name;

    public Owner(String name) {
        this.name = name;
    }

    @Override
    public Owner clone() {
        try {
            Owner clone = (Owner) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
