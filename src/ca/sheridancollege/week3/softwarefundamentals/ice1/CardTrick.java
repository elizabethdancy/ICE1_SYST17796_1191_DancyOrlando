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
 * @modified by conor tompkins
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.floor(Math.random() * 14)));
            c.setSuit(Card.SUITS[(int)(Math.floor(Math.random() * 4))]);
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        /*Card userCard = new Card();
        System.out.println("Enter your cards value: ");
        userCard.setValue(keyboard.nextInt());
        System.out.println("Enter your cards suit: ");
        userCard.setSuit(Card.SUITS[keyboard.nextInt()]);
        */
        Card luckyCard = new Card();
        luckyCard.setSuit("Clubs");
        luckyCard.setValue(8);
            
        // and search magicHand here
        boolean match = false;
        for (int i = 0; i<magicHand.length; i++){
            if (luckyCard.getSuit() == magicHand[i].getSuit() && luckyCard.getValue() == magicHand[i].getValue()){
                match = true;
            }
        }
        //Then report the result here
        String result = (match ? "Your card matched!" : "Your card did not match");
        System.out.println(result);
    }
    
}
