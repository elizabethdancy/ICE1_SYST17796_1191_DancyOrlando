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
 * modified by Michael Jamieson, 991532145
 */
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)Math.random()*13 +1);
            c.setSuit(Card.SUITS[(int)Math.random()*4]);
            magicHand[i] = c;
        }
        
//         System.out.println("Pick a card, any card.");
//         Card user = new Card();

//         System.out.println("Enter value from 1-13");
//         int val = sc.nextInt();
//         user.setValue(val);
//         sc.nextLine();
        
//         System.out.println("Enter suit");
//         String s1 = sc.nextLine();
//         user.setSuit(s1);
        
        boolean match = false;
        for (int i=0; i<magicHand.length; i++) {
            if (magicHand[i].getValue() == 6) {
                if (magicHand[i].getSuit().matches("clubs"))
                    match = true;
            }
        }
        
        if (match == true) {
            System.out.println("Its a match");
        } else
            System.out.println("Its not a match");
        
        Card luckyCard = new Card();
        luckyCard.setValue(6);
        luckyCard.setSuit("Clubs");
        }
    
    }
