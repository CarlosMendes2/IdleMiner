package model.ambient;

import model.interfaces.Minerals;

public class Mineral implements Minerals {
    private String name;
    private double chance;
    private int amount;

    public Mineral(String nome,double chance) {
        this.name = nome;
        this.chance = chance;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean update() {
        return false;
    }
}
