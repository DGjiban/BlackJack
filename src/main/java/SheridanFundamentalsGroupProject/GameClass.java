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
public class GameClass {
    
    //Atributes and variables for game class
    private DeckClass deck, emptyDeck;
    private DealerClass dealer;
    private HumanClass human;
    private double money;
    private double bet;
   
    public GameClass(){

        //New deck
        deck.createDeck();
        
        //New empty deck
        emptyDeck.createDeck();
        
        //Create the People
        dealer = new DealerClass();
        human = new HumanClass();
        
        money = 150.0;
        bet = 0;

        //Shuffle the deck and start the first round
        deck.shuffleDeck();
        startGame();
    
    }
        
    private void startGame(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the classic Black Jack Game! \n What is your name?");
        
        human.setName(input.nextLine());
        
        System.out.println("Nice to meet you " + human.getName() + "you have " + money + "\n How much do you wanna bet?");
        bet = input.nextDouble();
        
        //Dealer draw 2
        dealer.getHand().drawDeck(deck);
        dealer.getHand().drawDeck(deck);

        //Player Draw 2
        human.getHand().drawDeck(deck);
        human.getHand().drawDeck(deck);
        
        //Display the hands
        dealer.dealerHand();
        human.displayHand();    
    
        boolean dealerBJ = dealer.blackGackGG();
        boolean humanBJ = dealer.blackGackGG();
    
    
        //Check if dealer has BlackJack
        if(dealerBJ){
        
        //Show the dealer has BlackJack
        dealer.dealerHand();

            //Check if the player also has BlackJack
            if(humanBJ){
                //End the round with a push
                System.out.println("You both have 21, Draw");
                money += bet;
                startGame();
            }
            else{
                System.out.println("Dealer has BlackJack. You lose.");
                money -= bet;
                dealer.dealerHand();
                startGame();
            }
        }

        //Check if player has blackjack to start
        if(humanBJ){
            System.out.println("Blackjack! You win!");
            money = money+bet;
            startGame();
        }
        
        human.choice(deck);
        
       //Check Human Hand
       if(human.getHand().getValueHand()> 21){
            System.out.println("You have gone over 21.");
            money = money-bet;
            startGame();
        }
       
    }
}
