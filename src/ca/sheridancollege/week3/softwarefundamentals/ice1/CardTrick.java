/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Locale;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        Card luckyCard = new Card()
            luckyCard.setVale(5);
            luckyCard.setSuit("Hearts");
        
        Card userCard = new Card();
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random() * 13 + 1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) (Math.random() * 3)]);
            //set each element of the array to a value created by c.
            magicHand[i] = c;

            //display array results as a means to verify if my conditional checking works properly
            //System.out.println(magicHand[i].getValue() + " " + magicHand[i].getSuit());
        }

        //insert code to ask the user for Card value and suit, create their card
        java.util.Scanner input = new java.util.Scanner(System.in);

        //Have user make a card number value
        //Pre-loop: flag is made to enter the while loop.
        int flag = 1;
        //validInt will equal the scanner object and will be parsed into an int data type
        int validInt;
        while (flag == 1) {
            System.out.print("Please enter in a value from 1-13: ");
            //input will be parsed into only accepting an int value so as to not crash the program.
            try {
                userCard.setValue(validInt = Integer.parseInt(input.next()));
                if (userCard.getValue() <= 0 || userCard.getValue() > 13) {
                    throw new IllegalArgumentException();
                } else {
                    System.out.println("Your value: " + userCard.getValue());
                    //In loop: control is now changed to 2 and loop will break.
                    flag = 2;
                }
            } catch (NumberFormatException notNum) {
                System.out.println("\nThat is not a number value. Please re-enter a value from 1-13.\n");
            } catch (IllegalArgumentException invValue) {
                System.out.println("\nThat value is out of range. Please re-enter a value from 1-13.\n");
            }
        }//End of value loop

        //Have user make the card Suit value
        //Pre-loop: flag is reinstated to one so as to enter this second loop.
        flag = 1;
        while (flag == 1) {
            System.out.print("\nPlease enter in a suit (Hearts, Diamonds, Spades, Clubs): ");
            try {
                userCard.setSuit(input.next());
                //.matches will accept only the parameters stated. Anything else will throw an error.
                if (userCard.getSuit().matches("Hearts|Diamonds|Spades|Clubs")) {
                    System.out.println("Your suit: " + userCard.getSuit());
                    //In-loop: control will change to 2 and loop will break.
                    flag = 2;
                } else {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException invSuit) {
                System.out.println("\nThat is an invalid entry. Please re-enter either Hearts, Diamonds, Spades or Clubs");
            }
        }//End of suit loop

        // and search magicHand here
        //isInHand will hold a boolean value which will assist in displaying result of card being in the hand.
        boolean isInHand = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == userCard.getValue() && magicHand[i].getSuit().equals(userCard.getSuit())) {
                isInHand = true;
            }
        }

        //Then report the result here
        System.out.printf("\nYour hand: %d %s \n", userCard.getValue(), userCard.getSuit());
        System.out.print("The magic hand: ");
        for (int i = 0; i < magicHand.length; i++) {
            System.out.print(magicHand[i].getValue() + " of " + magicHand[i].getSuit() + "  ");
        }

        //isInHand will be used here to display results.
        if (isInHand == true) {
            System.out.println("\nYour card is in the magic hand!");
        } else {
            System.out.println("\nYour card is not in the magic hand!");
        }
    }

}
