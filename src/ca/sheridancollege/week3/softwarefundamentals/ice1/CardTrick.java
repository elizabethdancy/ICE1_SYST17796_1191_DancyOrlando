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
 * @modified by Greg Knott, 
 */
import java.util.Scanner;
import java.util.Random;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        int noCardCounter = 0;
        int cardCounter = 0;
        Card luckyCard = new Card();
        luckyCard.setValue(1);
        luckyCard.setSuit("Clubs");
        
        for (int i=0; i < magicHand.length; i++)
        {
            Random r = new Random();
            int val = (r.nextInt(12)+1);
            int suit = (r.nextInt(3));
        
            Card c = new Card();
            c.setValue(val);
            c.setSuit(Card.SUITS[suit]);
            magicHand[i] = c;
        }
        
        Card userCard = new Card();
        System.out.print("Please enter a card value: ");
        userCard.setValue(scan.nextInt());
        System.out.print("Please enter a card Suit: ");
        userCard.setSuit(scan.next());
        
        for (int i=0; i < magicHand.length; i++)
        {
            if ((userCard.getValue() == magicHand[i].getValue()) && 
                    (userCard.getSuit().equals(magicHand[i].getSuit())))
                cardCounter++;
            else
                noCardCounter++;
        }
        
        if (noCardCounter == magicHand.length)
            System.out.println("Your card was not in the magic hand");
        else if (cardCounter > 0)
            System.out.println("Your card was in the magic hand!");
    }
    
}
