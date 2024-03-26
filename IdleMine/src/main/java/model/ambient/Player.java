package model.ambient;

import model.interfaces.Item;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Item> bag;
    private Mine mina;

    public Player(String name) {
        this.name = name;
        mina = new Mine();
    }

    public String getName() {
        return name;
    }
}
