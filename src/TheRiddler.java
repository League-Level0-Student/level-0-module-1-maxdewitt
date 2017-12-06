import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		int score = 0;
		String answer = "Meat";
		String userAnswer = JOptionPane.showInputDialog(null, "First riddle! Paul's height is six feet, he's an assistant at a butcher's shop, and wears size 9 shoes. What does he weigh?");
		if (userAnswer.equalsIgnoreCase(answer)) {
			score += 5;
	    JOptionPane.showMessageDialog(null, "Nice Job! You gained +5 points! Current Score: " + score);
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, that is incorrect. No points were gained. Current Score: " + score);
		}
		
		answer = "incorrect";
	    userAnswer = JOptionPane.showInputDialog(null, "Which word in the dictionary is spelled incorrectly?");
		if (userAnswer.equalsIgnoreCase(answer)) {
			score += 5;
	    JOptionPane.showMessageDialog(null, "Nice Job! You gained +5 points! Current Score: " + score);
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, that is incorrect. No points were gained. Current Score: " + score);
		}
		JOptionPane.showMessageDialog(null, "Game over! Final Score: " + score);
	}
	}


