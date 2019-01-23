/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.*;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modified Jacob Sintzel January 23, 2019
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(new Random().nextInt(13));
            c.setSuit(Card.SUITS[new Random().nextInt(3)]);
            magicHand[i]=c;
        }
        
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int cardNumber= input.nextInt();
        System.out.print("Please enter a suit: ");
        String cardSuit=input.next();

        for(int i=0; i<magicHand.length; i++){
            if(cardNumber == magicHand[i].getValue() && cardSuit.equals(magicHand[i].getSuit())){
                System.out.println("Congratulations, you've guessed the correct card!");
            }
            else{
                System.out.println("Incorrect card");
                break;
            }
        }

    }
    
}
