/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.util.Scanner;

/**
 *
 * @author rayan4858
 */
public class Location {
    private String locationName;
    private Scene[] scenes; 
    private String nextLocation;
    
    
    public Location(Scanner input){
        locationName = input.nextLine();
        
        scenes = new Scene[4];
        for (int i = 0; i < 4; i++) {
            //creats a scene
            Scene s = new Scene(input);
            //puts scene in the list
            scenes[i] = s;
            System.out.println(locationName);
            System.out.println(scenes[i]);

        }
    }
    

    public void getImage(){
        
    }
    
    public String getDesciption(){
       return this.locationName;
    }
}
