/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SheridanFundamentalsGroupProject;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class HumanClass extends PlayersClass {
    
    //Scanner object
    Scanner input = new Scanner(System.in);
    
    //Create a new Player
    public HumanClass() {

        super.setName("Player");
    }
    
   public void choice(DeckClass deck){
        String choice = null;
        boolean answer = true;

        while(answer){

            try{
                System.out.println("What would you like to do? Draw or Stand");
                choice = input.nextLine();
                answer = false;

            }
            catch(Exception e){
                System.out.println("Invalid");
                input.next();
            }
        }
        
        System.out.println("You selected: " + choice);

    }
   
    

}
