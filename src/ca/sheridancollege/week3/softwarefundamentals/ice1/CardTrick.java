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
import java.util.Scanner;
import java.util.Random;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        boolean win = false;
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int val = r.nextInt(12)+1;
            c.setValue(val);
            
            String suit = Card.SUITS[r.nextInt(3)];
            c.setSuit(suit);
            
            //c.setSuit(Card.SUITS[insert call to random number between 
            //0-3 here])
            magicHand[i] = c;
        }
        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        System.out.println("Enter the Card value:");
        int value = in.nextInt();
        
        in.nextLine();
        System.out.println("Enter the Card suit:");
        String cardSuit = in.nextLine();
        System.out.println(cardSuit);
        
        //checks if user has a magic hand
        for(int i = 0; i < magicHand.length; i++) {
            if(magicHand[i].getValue() == value && 
                    magicHand[i].getSuit().equalsIgnoreCase(cardSuit)) 
            {
                
                win = true;
            }
            
            else {
              
                win = false;
            }
        }//end of for loop
        
        if(win) {
            System.out.println("\nCongratulations you "
                        + "win! You have a magic hand");
        }
        else {
            System.out.println("\nSorry you lose. "
                        + "You did not get a magic hand.");
        }
                
    }
    
}
