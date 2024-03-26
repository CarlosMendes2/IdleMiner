package model.equipament;

import model.interfaces.Item;

public class Pickaxe implements Item {
    private int power;
    private int luck;
    private int durability;

    public Pickaxe(int power, int luck, int durability) {
        this.power = power;
        this.luck = luck;
        this.durability = durability;
    }

    @Override
    public int durabilityCounter() {
        return 0;
    }
}
