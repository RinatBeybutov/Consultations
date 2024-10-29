package org.example;

import java.util.List;

public class Cat implements Cloneable{

    private String name;
    private Owner owner;
    private int age;
    private List<String> aliases = List.of("cat1", "cat2");

    public Cat(String name, Owner owner, int age) {
        this.name = name;
        this.owner = owner;
        this.age = age;
    }

    @Override
    public Cat clone() {
        try {
            Cat clone = (Cat) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            clone.setOwner(owner.clone());
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

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getAliases() {
        return aliases;
    }
}
