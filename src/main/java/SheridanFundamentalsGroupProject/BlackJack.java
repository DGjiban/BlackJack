/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SheridanFundamentalsGroupProject;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       GameClass game = new GameClass(); 
       
        //Welcome Message
        System.out.println("Welcome to the classic Black Jack Game! \n What is your name?");
        String name = input.nextLine();
               
        DeckClass testDeck = new DeckClass();
              
        testDeck.createDeck();
        testDeck.shuffleDeck();

        HandClass testHand = new HandClass();
        testHand.drawDeck(testDeck);
        testHand.drawDeck(testDeck);
        System.out.println("testHand now has the following cards:");
        System.out.println(testHand);
 
    System.out.println("The value of this hand is: " + testHand.getValueHand());

//System.out.println("testDeck now looks like this:");
 //System.out.println(testDeck);
        
        //Print out the deck
        //System.out.println(testDeck);
    }
    
}
