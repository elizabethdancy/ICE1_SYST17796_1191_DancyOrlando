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
 * @modified by student: Mas Tsukada
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(13);
        int randomSuit = random.nextInt(3);
        String suit;
        if(randomSuit == 0){
            suit = "Diamonds";
        }else if(randomSuit == 1){
            suit = "Clubs";
        }else if(randomSuit == 2){
            suit = "Hearts";
        }else{
            suit = "Spades";
        }
       
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
           Card c = new Card();
           c.setValue(randomSuit);
           c.setSuit(suit);
           magicHand[i] = c;   
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        System.out.println("what is your card value");
        int card = input.nextInt();
        System.out.println("what is your card suit");
        String suitValue = input.next();
        
        
        for (int i=0; i<magicHand.length; i++){
           if(magicHand[i].getValue() == card && magicHand[i].getSuit().equals(suitValue)){
               System.out.println("the card is the same");
           }else{
               System.out.println("card is not the same");
           }
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
         card Luckcard = new card();
        Luckcard.setvalue(9);
        Luckycard.setSuit("Hearts");
    }
    
}
