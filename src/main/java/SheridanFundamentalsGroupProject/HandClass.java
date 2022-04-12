/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SheridanFundamentalsGroupProject;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class HandClass {

    ArrayList<CardsClass> hand;

    public HandClass(){
        hand = new ArrayList<CardsClass>();
    }
    
    public void drawDeck(DeckClass deck){
        hand.add(deck.draw());
    }
    
    //Return the sum on the hand
    public int getValueHand(){
        int number = 0, ace =0;
         
    //For statement to sum the card values
        for (CardsClass card: hand){
            switch (card.getNumbers()){
                case ACE: ace++; break;
                case TWO: number += 2; break;
                case THREE: number += 3; break;
                case FOUR: number += 4; break;
                case FIVE: number += 5; break;
                case SIX: number += 6; break;
                case SEVEN: number += 7; break;
                case EIGHT: number += 8; break;
                case NINE: number += 9; break;
                case TEN: number += 10; break;
                case JACK: number += 10; break;
                case QUEEN: number += 10; break;
                case KING: number += 10; break;
            }
            for (int i = 0; i < ace; i++){
                if(number <= 10){
                    number += 11;
                }else{
                     number += 1;
                }
                }
            }
            return number;
        }
    
    public CardsClass getCard(int i){
        return hand.get(i);
    }
    
    @Override
    public String toString(){
        String output = "";
        for(CardsClass card: hand){
        output += card + "\n";
    }
    return output;
}
}

