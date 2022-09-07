package AdvancedTextBaseRPG;


import java.util.Scanner;

public abstract class Location {
    private Player player;
    protected String name;
    public static Scanner keyboard = new Scanner(System.in);

    public Location(Player player) {
        this.player = player;
    }

    abstract boolean onLocation();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}