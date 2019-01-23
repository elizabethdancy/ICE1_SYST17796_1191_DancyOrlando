/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifiedBy Henson Mak, 2019
 */
public class CardTrick {
    
    public static void main(String[] args){
        Card[] magicHand = new Card[7];
        Card c = new Card();
        
        for (int i = 0; i < magicHand.length; i++){
            c.setValue((int)(Math.random() * 8));
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("What is your card's value and suit?");
        Card specialCard = new Card();
        specialCard.setValue(8);
        specialCard.setSuit(Card.SUITS[3]);
        
        // and search magicHand here
        boolean isCard = false;
        for (int i = 0; i < magicHand.length; i++) {
            if(magicHand[i] == specialCard){
                isCard = true;
            }
        }
        //Then report the result here
        for (int i = 0; i < magicHand.length; i++) {
            String format = "Magic hand contains:%n"
                    + "%s of %s %n";
            System.out.printf(format, magicHand[i].getValue(), magicHand[i].getSuit());
        }
        
        if(isCard == true)
            System.out.println("The magic hand contains your card!");
        else
            System.out.println("The magic hand does not contain your card!");
        
    }
    
}
