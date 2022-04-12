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
    
public boolean choice(){
    String choice = null;
    boolean answer = true, check = true;

    while(check){
        try{
            System.out.println("What would you like to do? Draw or Stand");
            choice = input.nextLine();
            
            if(choice.equalsIgnoreCase("draw")){
                answer = true;
                check = false;
            }else if(choice.equalsIgnoreCase("stand")){
                answer = false;
                check = false;
            }else{
                System.out.println("Wrong choice, try again.");
            }
            
        }catch(Exception e){
            System.out.println("Wrong choice, try again.");
            input.next();
        }   
    }
    return answer;
}
   
    

}
