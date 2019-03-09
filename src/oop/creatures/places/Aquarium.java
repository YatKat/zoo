package oop.creatures.places;

import oop.creatures.fishes.Shark;

public class Aquarium implements Places<Shark> {
    @Override
    public Shark goToPlace() {
        return new Shark();
    }
}
