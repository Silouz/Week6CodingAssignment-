package Week6CodingAssignmentFinal;

public class Card {
	// a.      Card

   // i.     Fields  
//****** we have 2 fields in class card
//int value and String name **************. 

                     		//  1.     value (contains a value from 2-14 representing cards 2-Ace)
		int value;
							//  2.     name (e.g. Ace of Diamonds, or Two of Hearts)
		String name;
							//   ii.    Methods
		
//***Constructor*** our constructor with 2 parameters. 
		
		
		public Card (int value, String name) {
			this.value = value;
			this.name = name; // Spades, Hearts, Clubs, Diamonds. 
			
		}

		
		


	//1.  ******** here we have established Getters and setters. ***************
		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	
		 
		

//2. ***************describe (prints out information about a card)**************
		public void describe() {
			System.out.println(this.value + " of " + this.name);
		}
	
		
	

}//********End of Public Class Card*******************

