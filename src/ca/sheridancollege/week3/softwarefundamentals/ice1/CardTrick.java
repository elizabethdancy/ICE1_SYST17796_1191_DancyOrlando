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
public class LuckyCard {
    
    public static void main(String[] args)
    {
    Card[] magicHand = new Card[7];
        Random rand = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(12 + 1));
            c.setSuit(Card.SUITS[rand.nextInt(3)]);
            magicHand[i] = c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a suit");
        String chooseSuit = input.nextLine();
        System.out.println("Pick a number between 1 and 13");
        int chooseNum = input.nextInt();
        boolean isCard = false;
        for(int i = 0; i<magicHand.length; i++){
            if (magicHand[i].getSuit() == chooseSuit.getSuit() && magicHand[i].getValue() == chooseNum.getValue()){
                isCard = true;
                break;
            }
        }
        if (isCard==true){
            System.out.println("Your card is " + chooseNum + " of " + chooseSuit);
        }else{
            System.out.println("Not a card");
        }
       
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
