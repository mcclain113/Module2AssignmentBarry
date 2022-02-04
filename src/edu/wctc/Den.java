package edu.wctc;

public class Den extends Room implements Exitable{


    public Den(String name) {
        super(name);
    }

    @Override
    public String exit() {

        return null;
    }

    @Override
    public String exitIt() {
        return "You got out of the house!";
    }

    @Override
    public void getDescription() {
        System.out.println("What a mess in here. Looks like there is a door out.");
    }

    @Override
    public void getExits() {
        System.out.println("Exits are north and east.");
    }
}
