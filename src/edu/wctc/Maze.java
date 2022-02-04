package edu.wctc;

public class Maze<setPlayer> {
    private Room currentRoom;
    private Player player;
    private boolean isFinished = false;


    public void setPlayer() {

    }
    //A constructor that creates a Player object and assigns it to the field.


    public Maze() {
//The Maze constructor creates all of the Room objects in the game and connects them using the Rooms' setter methods. The Room in which the Player begins the game is assigned to the currentRoom field.
        Player player = new Player();

        DiningRoom diningroom = new DiningRoom("Dining Room") {


            @Override
            public void setEast(Room bedroom) {
                super.setEast(bedroom);
            }

            @Override
            public void setWest(Room kitchen) {
                super.setWest(kitchen);
            }
        };

        Bedroom bedroom = new Bedroom("Bed Room") {

            @Override
            public void setWest(Room diningroom) {
                super.setWest(diningroom);
            }
        };


        Den den = new Den("Den") {
            @Override
            public void setNorth(Room exit) {
                super.setNorth(exit);
            }

            @Override
            public void setEast(Room kitchen) {
                super.setEast(kitchen);
            }

            @Override
            public String exit()
                {
                    return "See ya later!";
                }

        };


        Room kitchen = new Room("Kitchen") {
            @Override
            public void getDescription() {
                System.out.println("Something smells good in the Kitchen");
            }

            @Override
            public void getExits() {
                System.out.println("Exits are east, west, and south");
            }

            @Override
            public Room getAdjoiningRoom(String x) {
                if (x == "w") {
                    return den;
                } else if (x == "e") {

                    return diningroom;
                } else if (x == "s") {
                    return livingRoom;
                }
                return null;
            }

        };

        Room livingRoom = new Room("Living Room") {
            @Override
            public void getDescription() {
                System.out.println("Welcome to my house. You have entered into the living room.");
            }

            @Override
            public void getExits() {
                System.out.println("The only exit is north");
            }

            @Override
            public Room getAdjoiningRoom(String x) {
                if (x == "n") {
                    return kitchen;
                }
                return null;
            }

        };
        setCurrentRoom(livingRoom);

    }

    public String exitCurrentRoom() {
        //returns a String. If the currentRoom is an Exit, it returns the result of calling exit() on the Room.
        // If not, it returns a message that the current room is not exitable.
        If (){
            return null;
        }
        else {

        }

    }

    public void interactWithCurrentRoom() {
        //returns a String. If the currentRoom is Interactable, it returns the result of calling interact on the Room.
        // If not, it returns a message that no interactions are possible.
    }

    public void lootCurrentRoom() {
        //returns a String. If the currentRoom is Lootable, it returns the result of calling loot on the Room.
        // If not, it returns a message that the current room is not lootable.
    }

    public void move(char x) {
        //returns a boolean. If the direction is valid to move from within the currentRoom, the adjoining Room becomes the new currentRoom and the method returns true.
        // If not, the method returns false.
    }


    public void getPlayerScore() {
        //return the result of calling the Player's getScore
        player.getScore();
    }

    public void getPlayerInventory() {
        //return the result of calling the Player's getInventory
        player.getInventory();
    }


    public void getCurrentRoomDescription() {
        //return the result of calling the getDescription method of the currentRoom
        currentRoom.getDescription();
    }


    public void getCurrentRoomExits() {
        //return the result of calling the getExits method of the currentRoom
        currentRoom.getExits();
    }


    public void isFinished() {
        // returns the Maze's isFinished field (a boolean).
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

}



