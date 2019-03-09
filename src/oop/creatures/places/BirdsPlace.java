package oop.creatures.places;

import oop.creatures.birds.Pinguin;

public class BirdsPlace implements Places<Pinguin> {
    @Override
    public Pinguin goToPlace() {
        return new Pinguin();
    }
}
