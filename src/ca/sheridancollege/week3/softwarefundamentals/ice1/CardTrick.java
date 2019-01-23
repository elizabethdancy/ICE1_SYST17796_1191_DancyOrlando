/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @modifier Hung-Han,Chen #991531300
 *
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        Card myCard = new Card();
        myCard.setSuit(Card.SUITS[1]);
        myCard.setValue(6);
        
        Card luncyCard = new Card();
        luncyCard.setSuit(Card.SUITS[1]);
        luncyCard.setValue(6);      
        
        boolean finalResult = false;

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            int number = (int) (Math.random() * 13 + 1);
            c.setValue(number);
            System.out.print(c.getValue());
            int suit = (int) (Math.random() * 4);
            c.setSuit(Card.SUITS[suit]);
            System.out.println(c.getSuit());

            magicHand[i] = c;
            
            if (myCard.getValue() == magicHand[i].getValue()
                    && myCard.getSuit().equals(magicHand[i].getSuit())) {
                finalResult = true;
                break;
            } else {
                finalResult = false;
            }

        }
        if (finalResult ){
            System.out.println("Match");
        }else{
            System.out.println("No Match");
        }
            

//        if (myCard.getValue() == magicHand[i].getValue()
//                && myCard.getSuit().equals(magicHand[i].getSuit())) {
//            System.out.println("match");
//            break;
//        } else {
//            System.out.println("No match");
//        }

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
