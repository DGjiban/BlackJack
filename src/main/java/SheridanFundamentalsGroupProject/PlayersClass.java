/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SheridanFundamentalsGroupProject;

/**
 *
 * @author david
 */
public abstract class PlayersClass {
    
    //Attributes of class
    private HandClass hand;
    private String name;
    
    //New Player
    public PlayersClass(){
        this.hand = new HandClass();
        this.name = "";
    }
    
    //check black jack
    public boolean blackJackGG(){
    
        if(this.getHand().getValueHand() == 21){
            return true;
        }else{
            return false;
        }
    }

    //Getters and Setters
    public HandClass getHand() {return hand;}
    public void setHand(HandClass hand) {this.hand = hand;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    
    //display the hand
    public void displayHand(){
        System.out.println(getName() + " hand is :");
        System.out.println(getHand() + " The hand Value is =  " + getHand().getValueHand());
    }
    
}
