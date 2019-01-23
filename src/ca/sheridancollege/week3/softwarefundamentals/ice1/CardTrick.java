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
 * @modifiedby Neil Froggatt, 991549831 January 23, 2019
 */

import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Card userCard = new Card();
        boolean match=false;
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Pick a card value (from 1 to 13)");
        userCard.setValue(myScanner.nextInt());
        System.out.println("Pick a card suit (0-Hearts, 1-Diamonds, 2-Spades, 3-Clubs)");
        userCard.setSuit(Card.SUITS[myScanner.nextInt()]);
        System.out.println("you picked card value of:"+userCard.getValue());
        System.out.println("you picked card suit of:"+userCard.getSuit());
        
        System.out.println("Cards in the hand are:");
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random()*13+1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*3)]);
            System.out.println(c.getValue()+c.getSuit());
            if((c.getValue()==userCard.getValue())&&(c.getSuit()==userCard.getSuit())){
                match=true;
            }
            magicHand[i]=c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //moved this code up so we don't have to loop twice
        //Then report the result here
        
        if(match){
            System.out.println("You're card is in the magicHand");
        }else{
            System.out.println("You're card is NOT in the magicHand");
        }
        
        
    }
    
}
