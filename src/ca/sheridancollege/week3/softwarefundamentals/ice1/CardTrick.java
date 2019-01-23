/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to
 * pick a card and searches the array of cards for the match to the user's card. To be used as
 * starting code in ICE 1
 *
 * @author Sean Jaeger Student Number: 991517871
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {

            Card c = new Card();

            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random() * 13 + 1));

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[((int) (Math.random() * 4))]);
            magicHand[i] = c;
        }

        Card choice = new Card();

//         //insert code to ask the user for Card value and suit, create their card
//         System.out.print("Please type in a Card value: ");
//         int value = input.nextInt();
//         choice.setValue(value);

//         System.out.print("Please enter a Suit: ");
//         String suit = input.next();
//         choice.setSuit(suit);
        
           choice.setSuit("Spades");
           choice.setValue(3);
            

        // and search magicHand here      
        for (int i = 0; i < magicHand.length; i++) {

            if ((choice.getValue(value) = magicHand[i].getValue()) && choice.getSuit(suit) = magicHand[i].getSuit()) {
                System.out.println("Your Card is in the Magic Hand");
                
            } else {
                System.out.println("Your Card is not in the Magic Hand");
            }

            System.out.println("Thank you for playing");
        }
        //Then report the result here
    }

}
