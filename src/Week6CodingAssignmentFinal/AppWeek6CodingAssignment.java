package Week6CodingAssignmentFinal;

public class AppWeek6CodingAssignment {

	public static void main(String[] args) {
		
	//a. Instantiate a Deck **********
		Deck deck = new Deck();
		deck.shuffle();
		
		
	///	a. Instantiate 2 players  **********

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        
        
    ///here we iterate 52 times, calling the ".draw" method    **********

        for (int i = 0; i < 52; i++) {   
            player1.draw(deck);
            player2.draw(deck);
        }
        
        
  ///  iterate 26 times for each player, calling the ".flip" method 
  ///   from Player Class

        for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            if (card1 != null && card2 != null) {
                int player1Value = card1.getValue();
                int player2Value = card2.getValue();
     /// here we compare the value of each card returned by each player's flip methods.
                if (player1Value > player2Value) {
                    player1.incrementScore();
                    System.out.println("Player 1 scored a point!");
                } else if (player1Value < player2Value) {
                    player2.incrementScore();
                    System.out.println("Player 2 scored a point!");
                } else {
                    System.out.println("A tie!?!?!...  No-one-lives.. I-mean No points!.");
                }
            }
        }
        
      // here we were asked to print values of each player ************
      //and the winner's name.

       int score1 = player1.getScore();  
       int score2 = player2.getScore();
       

        System.out.println("Final Score:");
        
        System.out.println("Player 1: " + score1);
        
        System.out.println("Player 2: " + score2);

        System.out.println(score1 > score2 ? "Player 1 wins!" : (score1 < score2 ? "Player 2 wins!" : "It's a draw!"));
    } //main method
	

}//public class App
