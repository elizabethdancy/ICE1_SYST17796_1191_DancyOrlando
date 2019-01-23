/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

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
        
        for (int i = 0; i < magicHand.length; i++){
            Card c = new Card();
            c.setValue((int)(Math.random() * 14));
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            magicHand[i] = c;
        }
        
        /*
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        Card specialCard = new Card();
        
        // Get users card's value
        System.out.print("What is your card's value?: ");
        int specialValue = input.nextInt();
        specialCard.setValue(specialValue);
        
        // Get users card's suit
        System.out.print("What is your card's suit?: ");
        input.next();
        String specialSuit = input.nextLine();
        specialCard.setSuit(specialSuit);
        */
        System.out.println();
        
        // Hard code special card as 8 of diamonds
        Card specialCard = new Card();
        specialCard.setValue(8);
        specialCard.setSuit("Diamonds");
       
        
        // and search magicHand here
        boolean isCard = false;
        for (int i = 0; i < magicHand.length; i++) {
            if(magicHand[i].getValue() == specialCard.getValue() && magicHand[i].getSuit().equals(specialCard.getSuit())){
                isCard = true;
            }
        }
        //Then report the result here
        for (int i = 0; i < magicHand.length; i++) {
            String format = "%d of %s %n";
            
            System.out.printf(format, magicHand[i].getValue(), magicHand[i].getSuit());
            
        }
        
        if(isCard == true)
            System.out.printf("%nThe magic hand contains your card!%nYour card was %d of %s%n", specialCard.getValue(), specialCard.getSuit());
        else
            System.out.printf("%nThe magic hand does not contain your card!%nYour card was %d of %s%n", specialCard.getValue(), specialCard.getSuit());
        
    }
    
}
