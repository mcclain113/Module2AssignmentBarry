package edu.wctc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Create the Maze, and a Scanner to read keyboard input.
        Maze maze = new Maze();
        Scanner keyboard = new Scanner(System.in);

        //Begin a loop that will run until the Maze is finished.
    while(maze == maze) {
     //Within the loop:
    //Print the current room description.
        maze.getCurrentRoomDescription();
    //Print the current room exits.
        maze.getCurrentRoomExits();
    //Ask the player for a command and read the input as a char.
        System.out.println("Enter command: ");
        String x = keyboard.nextLine();
    //The commands 'n', 's', 'e', 'w', 'u', and 'd' will attempt to move the player in that direction. If the movement is not valid, print a message that says so.
    //The command 'i' will attempt to interact with the current room.
        maze.interactWithCurrentRoom();
    //The command 'l' (lower case L) will attempt to loot the current room.
        maze.lootCurrentRoom();
    //The command 'x' will attempt to exit the current room. A successful exit means that the maze is finished.
        maze.exitCurrentRoom();
    //The command 'v' prints the player's inventory.

        maze.getPlayerInventory();

}
        //When the maze is finished, print the player's score.
        maze.getPlayerScore();



    }
}
