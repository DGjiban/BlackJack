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
    private DeckClass deck;
    private DealerClass dealer;
    private HumanClass human;
    private double money;
    private double bet;
   
    //contructor
    public GameClass(){
            
        //Create the Players
        dealer = new DealerClass();
        human = new HumanClass();
        
        //Create and shuflle new deck 
        deck.createDeck();
        deck.shuffleDeck();
            
        //initializing variables
        money = 150.0;
        bet = 0;

        //Start the first round
        startGame();
    }
        
    //Main game method
    private void startGame(){
        
        //Create and shuflle new deck 
        deck.createDeck();
        deck.shuffleDeck();
        
        //check the player money
        if(money<0){
            //kind message to exit
            System.out.println("Sorry you lost the whole money, see you");
            System.exit(0);
        
        }else{
                   
            //Create and shuflle new deck 
            deck.createDeck();
            deck.shuffleDeck();
        
            //Scanner object
            Scanner input = new Scanner(System.in);
        
            //Meeting the player
            System.out.println("Welcome to the classic Black Jack Game! \n What is your name?");
            human.setName(input.nextLine());
        
            //Asking for a bet
            System.out.println("Nice to meet you " + human.getName() + "you have " + money + "\n How much do you wanna bet?");
            bet = input.nextDouble();
        
            //checking the bet
            while(bet>money){
                System.out.println("Sorry you don't have this money :( try between 1 and " + money);
                System.out.println("What is your bet?");
                bet = input.nextDouble();
            }
            
            System.out.println("Your bet was $" + bet + "Let's play!!");
        
            //Dealer draw 2
            System.out.println("Dealer is drawing 2 cards......");
            dealer.getHand().drawDeck(deck);
            dealer.getHand().drawDeck(deck);

            //Player Draw 2
            System.out.println("Dealer is hitting 2 cards for you......");
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
                }else{
                    System.out.println("Dealer has BlackJack. You lose.");
                    money -= bet;
                    dealer.dealerHand();
                    deck.clearDeck();
                    startGame();
                }
            }

            //Check if human player has blackjack
            if(humanBJ){
                System.out.println("Blackjack! You win!");
                money = money+bet;
                startGame();
            }
        
            while(human.choice()){
                human.getHand().drawDeck(deck);
                human.displayHand(); 
            }
            
            while(dealer.getHand().getValueHand()<15){
                System.out.println("Dealer will hit a card");
                dealer.getHand().drawDeck(deck);
            }           
                    
            //Check player human value is more than 21
            if(human.getHand().getValueHand()> 21){
                System.out.println("You have gone over 21. You lose :(");
                money = money-bet;
                startGame();
            }
            
            //Check who wins
            if(dealer.getHand().getValueHand()>21){
                System.out.println("Dealer busts, you win :)");
                money = money+bet;
            
            }else if(dealer.getHand().getValueHand() > human.getHand().getValueHand()){
                System.out.println("You lose. :(");
                money = money-bet;
            
            }else if(human.getHand().getValueHand() > dealer.getHand().getValueHand()){
                System.out.println("You win. :)");
                money = money+bet;
            
            }else{
                System.out.println("Push.");
            }

            //Cleanning the deck
            deck.clearDeck();
            
            //Start a new round
            startGame();         
                        
        }
    }
}
