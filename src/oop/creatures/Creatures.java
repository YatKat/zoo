package oop.creatures;

import oop.creatures.places.Places;

import java.util.List;

public abstract class Creatures {
    private String name;
    private int age;
    private List<Places> listOfPlaces;


    public abstract boolean isAlive();

    public abstract void live();

    public abstract void eat();

    public abstract void sleep();

    public abstract void breed();

    public abstract void moove();

    public abstract void sound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Places> getListOfPlaces() {
        return listOfPlaces;
    }

    public void setListOfPlaces(List<Places> listOfPlaces) {
        this.listOfPlaces = listOfPlaces;
    }
}
