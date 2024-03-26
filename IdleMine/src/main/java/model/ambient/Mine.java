package model.ambient;

import java.util.ArrayList;

public class Mine {
    private double experience = 0;
    private ArrayList<Miner> minersArmy = new ArrayList<>();
    private ArrayList<Wagon> wagonTrain = new ArrayList<>();
    private double goldCoins = 0;
    private int level = 1;
    private int danger = 1;
    private Rock pedra = new Rock();
    public Mine() {
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public double getGoldCoins() {
        return goldCoins;
    }

    public void setGoldCoins(double goldCoins) {
        this.goldCoins = goldCoins;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDanger() {
        return danger;
    }

    public void setDanger(int danger) {
        this.danger = danger;
    }
}
