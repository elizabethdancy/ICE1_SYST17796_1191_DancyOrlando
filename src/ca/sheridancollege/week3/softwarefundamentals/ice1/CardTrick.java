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
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];     // declare and initialize the array
        
        // for loop to search the magic hand
        for (int i=0; i<magicHand.length; i++)  
        {
            // randomize a value
            int randValue = (int)(Math.random() * 13) + 1;
            Card c = new Card();
            // set the value to object c
            c.setValue(randValue); 
            // randomize a suit value
            int randSuit = (int) Math.random() * 3;
            // set the suit value to object c
            c.setSuit(Card.SUITS [randSuit]);
            // initialize c to magicHand[i]
            magicHand[i] = c;
        }
        
        // ask user for card value
        System.out.print("Card Value (1-13):");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        // ask the user for a suit number
        System.out.print("Suit (1-3):");
        String suit = input.next();
        
        // declare and initialize the default value of a boolean
        boolean found = true;   
        
        // for loop that searches the magic hand and compares the value generated to the users card
        for (int i = 0; i < magicHand.length; i++) {
            
            // if statement
            if (magicHand[i].getValue() == value && magicHand[i].getSuit() == suit) {
                
                found = true;
                
            } else {
                
                found = false;
                
            }   // end of if statement
        
        }   // end of for loop
            
            // if statemnt that prints out the result to the user
            if (found == true) {
                
                System.out.println("You win");
                
            } else {
                
                 System.out.println("You lose");
            }   // end of if statement
    
    }   // end of main
        
}   // end of class
