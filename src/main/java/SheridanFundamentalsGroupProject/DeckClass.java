/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SheridanFundamentalsGroupProject;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author david
 */
public class DeckClass {
  
    //Attributes of class
    private ArrayList<CardsClass> deck;

    //Constructor Class
    public DeckClass(){
        deck = new ArrayList<>();
    }
    
    public void createDeck(){
        
        //Nested collections Loop to get the suit and number to create the deck
        for (CardsClass.Suits cardSuit: CardsClass.Suits.values()){
            for (CardsClass.Numbers cardNumber: CardsClass.Numbers.values()){ 
               
               //New card
               deck.add(new CardsClass(cardNumber,cardSuit));
            }
        }
    }
    
    public void shuffleDeck(){
        Collections.shuffle(deck);
    }
    
    public CardsClass draw(){

        //catch the first card from the deck
        CardsClass card = new CardsClass(deck.get(0));
        

        //Remove card from the deck
        deck.remove(0);
        
        //return the card
        return card;

    }
    
    public void addCards(ArrayList<CardsClass> cards){
        deck.addAll(cards);
    }
    
    public boolean cardsHand(){
        if (deck.size()>0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void clearDeck(){
        deck.clear();
    }
    
    /*public void restartDeck(DeckClass empty){
        this.addCards(empty.getCards());
        shuffleDeck();
        empty.clearDeck();
    }*/
    
    @Override
    public String toString(){
        String displayDeck = "";
           
        for(CardsClass card: deck){
            displayDeck += card.toString() + "\n";
        }
        return displayDeck;
    } 
}

