/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SheridanFundamentalsGroupProject;

/**
 *
 * @author david
 */
public class DealerClass extends PlayersClass{
    
    //Set the Dealer name
    public DealerClass(){
        super.setName("Dealer");
    }
        
    //Display the dealer hand without the second card
    public void dealerHand(){
        System.out.println("Dealer hand is:");
        System.out.println(super.getHand().getCard(0));
        System.out.println("The second card is secret.");
    }    
}
