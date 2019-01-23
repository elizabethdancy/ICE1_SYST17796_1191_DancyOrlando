/*
 Student #: 991540069
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Ivan Pavlov
 */
public class CardTrick {
    
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        boolean foundCard = true;
        Card[] magicHand = new Card[7];
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(1 + (int)(Math.random() * (13 - 1) + 1));
            c.setSuit(Card.SUITS[(int)(Math.random() * 3 + 1)]);
            magicHand[i] = c;
        }
        
        System.out.println("Please enter card value to find: ");
        int value = in.nextInt();
        in.nextLine();
        System.out.println("Please enter card suit to find: ");
        String suit = in.nextLine();
        
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == value && magicHand[i].getSuit().equalsIgnoreCase(suit)) {
                System.out.println("Congrats! Your card was found in the magichand!");
                foundCard = true;
                break;
            } else {
                foundCard = false;
            }
        }
        
        if (foundCard == false) {
            System.out.println("Sorry. Couldn't find your card :(");
        }
    }
    
}
