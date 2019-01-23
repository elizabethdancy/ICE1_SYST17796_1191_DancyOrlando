    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package ca.sheridancollege.week3.softwarefundamentals.ice1;
    import java.util.HashSet;
    import java.util.Random;
    import java.util.Scanner;
    import java.util.Set;
    /**
     * A class that fills a magic hand of 7 cards with random Card Objects
     * and then asks the user to pick a card and searches the array of cards
     * for the match to the user's card. To be used as starting code in ICE 1
     * @author dancye
     * @modifiedBy shbrando
     */
    public class CardTrick {

        public static void main(String[] args)
        {
            
                Scanner userKeys = new Scanner(System.in);
                Random r = new Random();
                 
                //Create the Magic Hand
                Card[] magicHand = new Card[7];
                for (int i=0; i<magicHand.length; i++)
                {
                    Card c = new Card();
                    c.setValue(r.nextInt(12) + 1);
                    c.setSuit(Card.SUITS[r.nextInt(3)]);
                    magicHand[i] = c;
                }
                
                /*Prompts User to Pick Suit + Value of card
                System.out.println("Please choose a Suit");
                String userSuit = userKeys.nextLine();
                System.out.println("Please choose the Value of the card");
                int userValue = userKeys.nextInt();
                Card userCard = new Card();
                userCard.setSuit(userSuit);
                userCard.setValue(userValue);
                */
            
                //Object for 5 of Diamonds
                Card myCard = new Card();
                myCard.setValue(5);
                myCard.setSuit("Diamonds");
            
          
                boolean matchingCard = false;   
                //Checks if myCard matches any of the cards in the magicHand array
                for (int i=0; i<magicHand.length; i++)
                {
                    if(magicHand[i].getSuit() == myCard.getSuit() && magicHand[i].getValue() == myCard.getValue()){
                        matchingCard = true;
                        break;
                    }
                }
                
                //If the card matches any, then true, else is false.
                if (matchingCard == true){
                    System.out.println("Card was found!");
                }else{
                    System.out.println("I didn't find your card.");
                }
        }

    }
