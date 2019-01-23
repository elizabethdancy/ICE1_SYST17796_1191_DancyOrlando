/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifiedBy gajewsjo, 23 January 2019
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        int i;
        
        for (i = 0; i < magicHand.length; i++)
        {
            Card c = new Card();
            Random rand = new Random();
            int randValue = rand.nextInt(12) + 1; // 1 to 13
            int randSuit = rand.nextInt(2) + 1; // 0 to 3
            c.setValue(randValue); // set random value
            c.setSuit(suits[randSuit]); // set random suit]
            magicHand[i] = c;
        }
        
        // Ask the user for Card value and suit
        Scanner scn = new Scanner(System.in);
        System.out.println("Pick a card! Any card!");
        System.out.print("Please enter your card value: ");
        int myValue = scn.nextInt();
        System.out.print("Please enter your card suit: ");
        String mySuit = scn.next();
        
        // Create the user's card
        Card myCard = new Card();
        myCard.setValue(myValue);
        myCard.setSuit(mySuit);
        
        // Search magicHand for user's card
        boolean matchingCards = false;
        for (i = 0; i < magicHand.length; i++)
        {
            if (magicHand[i].getSuit().matches(mySuit))
            {
                if (magicHand[i].getValue() == myValue)
                    matchingCards = true;
            }
        }
        
        // Report results
        System.out.println("\nYour results:\n------------\n");
        System.out.println("\tYour card: " 
                + myCard.getValue() + " of " + myCard.getSuit());
        if (matchingCards) System.out.println("\tIt's a match!");
        else System.out.println("\tSorry, better luck next time!");
        System.out.println("\nThe magic hand was:\n");
        for (i = 0; i < magicHand.length; i++)
        {
            System.out.println("\t" + magicHand[i].getValue() 
                    + " of " + magicHand[i].getSuit());
        }
    }
}
