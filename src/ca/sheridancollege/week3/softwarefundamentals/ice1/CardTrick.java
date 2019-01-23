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
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random randomCard = new Random();
        Scanner myScanner = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(randomCard.nextInt(13)+1);
            c.setSuit(Card.SUITS[randomCard.nextInt(4)]);
            magicHand[i]=c;
        }
        
        System.out.println("Insert a value from 1 to 13: ");
        int value = myScanner.nextInt();        
        
        System.out.println("Insert a card suit Hearts/Diamonds/Spades/Clubs: ");
        String suit = myScanner.nextLine();
        
        Card chosenCard = new Card();
        chosenCard.setSuit(suit);
        chosenCard.setValue(value);
        
        for (int i=0; i<magicHand.length; i++)
        {
            if ((chosenCard.getSuit().equals(magicHand[i].getSuit())) && chosenCard.getValue() == magicHand[i].getValue())
            {
                System.out.println("It's here!");
            }else{
                System.out.println("Nope");
            }
        }

    }
    
}
