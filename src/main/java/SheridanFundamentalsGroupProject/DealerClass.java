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
    
    public DealerClass(){
        super.setName("Dealer");
    }
    
    public void dealerHand(){
        System.out.println("Dealer hand is:");
        System.out.println(super.getHand().getCard(0));
        System.out.println("The second card is secret.");
    }
    
}
