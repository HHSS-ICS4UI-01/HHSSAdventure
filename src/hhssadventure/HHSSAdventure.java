/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lamon
 */
public class HHSSAdventure {
    private ArrayList<Location> locations = new ArrayList<Location>();
    private String startingLocation;
    private String startingDirection;
    private String currentLocation;
    private String currentDirection;
    private UserInterface gui;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HHSSAdventure f = new HHSSAdventure();
        
    }

    public HHSSAdventure(){

        //used to help read a file
        FileReader file = null;
        try {
            file = new FileReader("images/pics.txt");
        } catch (Exception e) {
            //prints out error message
            e.printStackTrace();
            //stops the program
            System.exit(0);
        }
        
        Scanner reader = new Scanner(file); 
        
        startingLocation = reader.nextLine();
        startingDirection = reader.nextLine();
        
        
        //keep scanning as long as theres something to scan
        while (reader.hasNext()) {
            //adding a class from the file
            Location a = new Location(reader);
            //addint the class to the list
            locations.add(a);
        }
        
        
    }
}
