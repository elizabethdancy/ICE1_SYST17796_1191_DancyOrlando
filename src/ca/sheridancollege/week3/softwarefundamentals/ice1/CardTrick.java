/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @modifier Kevin Dimarco 991518432
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*13) +1);
            c.setSuit(Card.SUITS[(int)(Math.random() * 3) +1]);
            magicHand[i] = c;
            System.out.println(c.getSuit() + " " + c.getValue());
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        System.out.println("Enter card value: ");
        int value = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter suit name: ");
        String suit = scanner.nextLine();
        boolean win = false;
        
        for (int i = 0; i < magicHand.length; i++) {
            if (value == (magicHand[i].getValue())) {
                if (suit.equals(magicHand[i].getSuit())) {
                    System.out.println("Your card was in the Magic Hand!");
                    win = true;
                    break;
                } 
            }   
        }
        if (win != true) {
            System.out.println("Your card was not in the Magic Hand.");
        }       
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
