package edu.wctc;

public class DiningRoom extends Room implements Interactable  {
    public DiningRoom(String name) {
        super(name);
    }

    @Override
    public void getDescription() {
        System.out.println("You made it into the dining room. Very quiet in here.");
    }

    @Override
    public void getExits() {
        System.out.println("Exits are east and west.");
    }

    @Override
    public String interact() {
        return "The floor is slippery.  You just wiped out.";
    }




}
