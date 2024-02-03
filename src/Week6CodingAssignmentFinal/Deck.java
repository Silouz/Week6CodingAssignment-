package Week6CodingAssignmentFinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Deck {

// 1. cards (List of Card) to store cards. 
List<Card> cards = new ArrayList<Card>();
 
//********* ii. MEHTODS  *************

//1.shuffle (randomizes the order of the cards)
public void shuffle() {
	Collections.shuffle(cards);
	
}
//2. draw (removes and returns the top card of the Cards 
//field,but also checks if it is empty)

public Card draw() {
	if (cards.isEmpty()) {
		return null;
	}else {
		return cards.remove(0);
	}
}

//3. In the constructor, when a new Deck is instantiated, the Cards
// field should be populated with the standard 52 cards.

//**************Constructor*************

  Deck(){
	
	//String array named "suits". 
	String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"}; 
	
	for (String suit : suits) {
		for (int value = 2; value <= 14; value++) {
			String name = nameOfCard(value) + " Of " + suit;
			cards.add(new Card(value, name));
			
				
				
			}	
		
	}
	
}// End of Constructor
 
 
 
 //***Switch statement ****** to replace Jack, King, Queen and Ace with numbers
 String nameOfCard(int value) {
	 String name;
	 switch (value) {
	 case 11: 
		 name = "Jack";
		 break;
	 case 12:
		 name = "Queen";
		 break;
	 case 13:
		 name = "king";
		 break;
	 case 14:
		 name = "Ace";
	 	 break;
	 default: 
		 name = String.valueOf(value);
		 
		 
		 
	 }
	 return name; 
 }
         
         


}/// Public Class Deck
