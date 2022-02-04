package edu.wctc;

public abstract class Room {
    private String name;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room up;
    private Room down;

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setUp(Room up) {
        this.up = up;
    }

    public void setDown(Room down) {
        this.down = down;
    }

    public Room (String name)
    {
        this.name = name;
    }

   public abstract void getDescription ();
        //The String will be displayed to the Player when they enter the Room and should contain a description of what they see.



    public Room getAdjoiningRoom (String x) {
        //if this Room is connected to another Room in the given direction,

        // then Room is returned.
        // Otherwise, return null.
        return null;
    }

    public abstract void getExits();
        //returns a String. The String should be a list of all of the directions the Player could exit from this Room to another Room.


    public String getName() {
        return name;
    }

    public void isValidDirection(char direction){
//accepts a char argument for the direction. If this Room is connected to another Room in the given direction, return true.
// Otherwise, return false.
    }
}
