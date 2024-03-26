package model.equipament;

import model.interfaces.Item;

public class Helmet implements Item {
    private int defense;
    private int durability;

    public Helmet(int defense, int durability) {
        this.defense = defense;
        this.durability = durability;
    }

    @Override
    public int durabilityCounter() {
        return 0;
    }
}
