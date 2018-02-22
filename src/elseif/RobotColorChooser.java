//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;
import org.jointheleague.graphical.robot.*;
import javax.swing.JOptionPane;
import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot DrNugget= new Robot();
		DrNugget.miniaturize();
		DrNugget.setSpeed(5);
		//3. Ask the user what color they would like the robot to draw
		String Culor=JOptionPane.showInputDialog("Dr.Nugget: What Color Would You like?");
		JOptionPane.showMessageDialog(null, "Dr.Nugget: Ok, I'll get right on that!");
		//4. Use an if/else statement to set the pen color that the user requested
		if(Culor.equals("Red")) {
			//instert color her3e boi!
		}
        //5. If the user doesn’t enter anything, choose a random color

        //6. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
		DrNugget.penDown();
	for(int i=0;i<360;i+=90) {
		DrNugget.turn(90);
		DrNugget.move(100);
	}
	DrNugget.penUp();
	DrNugget.turn(180);
	DrNugget.move(200);
	DrNugget.setAngle(0);
	DrNugget.sparkle();
	}
}
