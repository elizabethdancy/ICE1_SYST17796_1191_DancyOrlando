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
 * @modifiedBy Christopher Carbone - 991523523 - January 23, 2019
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner keyboard = new Scanner(System.in);
        
        // Added luckyCard
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit(SUITS[3]);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            magicHand[i] = c;
        }
        
        System.out.print("Pick a card!\nCard Value: ");
        int cardValue = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Card Suit: ");
        String cardSuit = keyboard.nextLine();
        int cardSuitValue = 0;
        
        for (int i = 0; i < Card.SUITS.length; i++)
        {
            if (cardSuit.equalsIgnoreCase(Card.SUITS[i]))
                cardSuitValue = i;
        }
        
        Card userCard = new Card();
        userCard.setValue(cardValue);
        userCard.setSuit(Card.SUITS[cardSuitValue]);
        
        boolean found = false;
        for (int i = 0; i < magicHand.length; i++)
        {
            if (magicHand[i].getSuit() == userCard.getSuit() && magicHand[i].getValue() == userCard.getValue())
            {
                found = true;
                break;
            }
        }
        
        if (found)
            System.out.println("Your card was found!");
        else
            System.out.println("Your card was not found!");
    }
    
}
