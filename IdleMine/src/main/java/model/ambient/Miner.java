package model.ambient;

import model.ambient.Wagon;
import model.interfaces.Item;
import model.interfaces.Minerals;

import java.util.HashSet;

public class Miner {
    private int hp;
    private int stamina;
    private int mineSpeed;
    private HashSet<Item> equipament = new HashSet<>();
    private Wagon wagonLinked = null;

    public Miner(int hp, int stamina, int mineSpeed, HashSet<Item> equipament, HashSet<Minerals> mined) {
        this.hp = hp;
        this.stamina = stamina;
        this.mineSpeed = mineSpeed;
        this.equipament = equipament;
        this.mined = mined;
    }

    public void setWagonLinked(Wagon wagonLinked) {
        this.wagonLinked = wagonLinked;
    }

    private HashSet<Minerals> mined = new HashSet<>();
    public int deliverMinerals(){
        return 0;
    }
}
