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
 * modifiedBy:Sommer Arruda
 *added hard coded lucky card from GitHub
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner keyIn = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*(13) + 1));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i] = c;
        }
        
        //adding lucking card
        Card luckyCard = new Card();
        luckyCard.setValue(12);
        luckyCard.setSuit("Diamonds");
        
        /*
        System.out.println("Input card number");
        int cardNumber = keyIn.nextInt();
        System.out.println("Input card suit ");
        String cardSuit = keyIn.next();*/
        
        /*
        Card userCard = new Card();
        userCard.setValue(cardNumber);
        userCard.setSuit(cardSuit);*/
        
        /*
        boolean didYouWin = false;
        for(int j = 0; j<magicHand.length; j++){
            if((cardNumber == magicHand[j].getValue()) && 
                    (cardSuit.equalsIgnoreCase(magicHand[j].getSuit()))){
                didYouWin = true;
                break;
            }
        }*/
        
         boolean didYouWin = false;
        for(int j = 0; j<magicHand.length; j++){
            if((luckyCard.getValue() == magicHand[j].getValue()) && 
                    (luckyCard.getSuit().equalsIgnoreCase(magicHand[j].getSuit()))){
                didYouWin = true;
                break;
            }
        }
            
        
        if(didYouWin == true){
            System.out.println("You win");
        }else{
            System.out.println("You lose");
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here

    }
    
}

