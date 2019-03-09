package oop.creatures.places;

import oop.creatures.animals.Tiger;

public class Terrarium implements Places<Tiger> {
    @Override
    public Tiger goToPlace() {
        return new Tiger();
    }
}
