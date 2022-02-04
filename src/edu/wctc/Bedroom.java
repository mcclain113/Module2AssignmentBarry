package edu.wctc;

public class Bedroom extends Room implements Lootable{
    public Bedroom(String name) {
        super(name);
    }


    @Override
    public String takeLoot() {
        return null;
    }

    @Override
    public void getDescription() {
        System.out.println("Looks cozy.  Wonder if there are any goodies?");
    }

    @Override
    public void getExits() {
        System.out.println("Can only exit west.");
    }
}
