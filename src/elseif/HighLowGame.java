//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
	
		// 2. Print out the random variable above
		//System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
	for (int i = 0; i < 10; i++) {
		
	
		String guess=JOptionPane.showInputDialog("Dr.Nugget: What is your guess?");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
		int ree=Integer.parseInt(guess);
			// 5. if the guess is correct
		if(ree==random) {
			JOptionPane.showMessageDialog(null, "Dr.Nugget: Wow. I am Impressed.congrats.");
			System.exit(0);
		}
				
				// 11. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
		else if(ree>random) {
			JOptionPane.showMessageDialog(null, "Dr.Nugget: Sorry. That number is to big. PLease try again.");
		}
				// 8. Tell them it's too high
			// 9. if the guess is low
		else if(ree<random) {
			JOptionPane.showMessageDialog(null, "Dr. Nugget: Wow. I am sorry that number is too low.");
		}
		
		}	// 10. Tell them it's too low
	JOptionPane.showMessageDialog(null, "Dr.Nugget: You have failed. Have fun in the asylum.");
		// 12. Tell them they lose
		
	}

}


