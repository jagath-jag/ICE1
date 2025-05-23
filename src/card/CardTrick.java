/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifier puthanpj (jagath-jag), 991 764 924
 * 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
            System.out.println("Card " + (i + 1) + ": " + c.getValue() + " of " + c.getSuit());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nPick a card value (1 to 13): ");
        int userValue = scanner.nextInt();
        scanner.nextLine(); // consume newline left by nextInt()

        System.out.print("Pick a card suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = scanner.nextLine().trim();

        // Create a user card from input
        //Card userCard = new Card();
        //userCard.setValue(userValue);
        //userCard.setSuit(userSuit);

            
        // and search magicHand here
        
        //boolean found = false;
        //for (Card c : magicHand) {
        //    if (c.getValue() == userCard.getValue() &&
        //        c.getSuit().equalsIgnoreCase(userCard.getSuit())) {
        //        found = true;
        //        break;
        //    }
        //}

        //if (found) {
        //    System.out.println("Your card is in the magic hand!");
        //} else {
        //    System.out.println("Your card was NOT found in the magic hand.");
        //}

        // add one luckcard hard code 2,clubs
        
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

        System.out.println("\nLucky Card: " + luckyCard.getValue() + " of " + luckyCard.getSuit());
        if (found) {
            System.out.println("Lucky card is in the hand!");
        } else {
            System.out.println("Sorry! lucky card not found.");
        }
        
    }
    
}
