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
 * @modifier 991530299
 * @dateMofified 2019-01-23
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setValue((int) (Math.random() * 7) + 1);
            c.setSuit(Card.SUITS[(int) (Math.random() * 3) + 1]);
            magicHand[i] = c;
            System.out.println(magicHand[i].getValue());
            System.out.println(magicHand[i].getSuit());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Scanner in = new Scanner(System.in);
        //System.out.println("Input a card (1-13) > ");
        Card card = new Card();
        //card.setValue(in.nextInt());
        card.setValue(8);
        //System.out.println("Input a suit (1-4) > ");
        //card.setSuit(Card.SUITS[in.nextInt()]);
        card.setSuit(Card.SUITS[3]);
        //Then report the result here
        boolean found = false;
        for (int i=0; i<magicHand.length; i++)
        {
            if(magicHand[i].getValue() == card.getValue() && magicHand[i].getSuit() == card.getSuit())
            {
                found = true;
            }
        }
        if(found)
        {
            System.out.println("Congrats! You Won!");
        }
        else
        {
            System.out.println("Sorry! You Lost!");
        }
    }
    
}
