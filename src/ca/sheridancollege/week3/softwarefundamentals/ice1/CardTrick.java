/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @ModifiedBy Sheetal
 */
public class CardTrick {
    
    
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        boolean found=true; 
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            c.setValue(GiveValue());
            c.setSuit(Card.SUITS[GiveSuit()]);
            System.out.println(c.getValue() + " " +c.getSuit());
            
            magicHand[i] = c;
        }
        
        //Code for ask the user to pick a card
         //insert code to ask the user for Card value and suit, create their card
        
        /*System.out.println("Please enter Card Value to Search: ");
        int value1 = in.nextInt();
        
        in.nextLine();
        System.out.println("Please enter Card Suit to Search: ");
        String suit1 = in.nextLine();
        
        for (Card c1 : magicHand) 
        {
            if (c1.getValue() == value1 && c1.getSuit()==suit1) {
                System.out.println("It is matched with the magicaHand");
            found = true;
                break;
            } 
            else 
            {
                found = false;
            }
        }
        
        if (found == false) {
            System.out.println("Can not find your card");
        }
        */
        
        Card luckyCard = new Card();
        luckyCard.setValue(10);
        luckyCard.setSuit(Card.SUITS[2]);
        
        
        
    /**
     *
     * @return
     */
    
     
       
        // and search magicHand here
          for (Card c1 : magicHand) 
        {
            if (c1.getValue() == luckyCard.getValue() && c1.getSuit()==luckyCard.getSuit()) {
                System.out.println("It is matched with the magicaHand");
            found = true;
                break;
            } 
            else 
            {
                found = false;
            }
        }
        
        if (found == false) {
            System.out.println("Can not find your card. You lose");
        }
       
        //Then report the result here
    }
    
    public static int GiveValue()
        {
        Random rand = new Random();

    // nextInt as provided by Random is exclusive of the top value so you need to add 1 

        int randomNum = rand.nextInt((13 - 1) + 1) + 1;
        return randomNum;
        }
    
    public static int GiveSuit()
        {
        Random rand = new Random();

    // nextInt as provided by Random is exclusive of the top value so you need to add 1 

        int randomSuit = rand.nextInt((3 - 0) + 1) + 0;
        return randomSuit;
        }
}
