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
 * @modifier Frankie Lau, 2019
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)Math.random()*13);
            c.setSuit(Card.SUITS[((int)Math.random()*3)]);
            magicHand[i] = c;
        }
        
        Card luckyCard = new Card();
        luckyCard.setSuit("Diamonds");
        luckyCard.setValue(13);
        
        for(int i = 0; i< magicHand.length; i++){
            if(luckyCard.getValue() == magicHand[i].getValue() && luckyCard.getSuit() == luckyCard.getSuit()){
                System.out.println("Card is in pile");
            }
            else{
                System.out.println("Not in pile");
            }
        }
        
       /** System.out.println("Please enter a card value: ");
        Scanner sc = new Scanner(System.in);
        int cardValue = sc.nextInt();
        System.out.println("Please enter a suit: ");
        Scanner sc_suit = new Scanner(System.in);
        String givenSuit = sc_suit.nextLine();
        
        for(int i = 0; i < magicHand.length; i++){
            if(cardValue == magicHand[i].getValue() && 
                    givenSuit == magicHand[i].getSuit()){
                System.out.println("Its your lucky card");
            }
            else{
                System.out.println(magicHand[i].getValue() 
                        + magicHand[i].getSuit());
            }
        }
        **/
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
