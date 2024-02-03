package Week6CodingAssignmentFinal;

	
	import java.util.ArrayList;
	import java.util.List;

	public class Player {

//1. here's the hand list
		List<Card> hand = new ArrayList<>(); //creating a list to hold player cards. 
		int score; // (to be set to 0 in the constructor)
		String name; //a Player's name. 
			
//2 and 3. here's the player name, and score set to 0. 		
	//******Constructor*********
	public Player(String name) { 
		this.name = name; 
		this.score = 0;
	}
//     ******* METHODS **********
//1.  describe() method to print a player's dealt hand. 
	public void describe() {
        System.out.println("Player: " + name);
        hand.forEach(Card::describe);
    }

//2.  a Method to flip 
	public Card flip() {
		if (hand.isEmpty()) {
			return null;
			
		}else{
			return hand.remove(0);
		}
	}

//3. Method for drawing a card. 
	public void draw(Deck deck) {
		Card card = deck.draw();
		if (card != null) {
			hand.add(card);

		}
	}
//4.  Increment score method. adds 1 to player's score field.
	public void incrementScore() {
		score++;
	}

	
	//************Getters and Setters*********
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	}/// Player 

	





