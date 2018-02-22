package elseif;

import javax.swing.JOptionPane;

public class IsuHappi {
public static void main(String[] args) {
String Mood=JOptionPane.showInputDialog("Are u happi?");
if(Mood.equals("Yes")) {
	JOptionPane.showMessageDialog(null,"Well than keep it up!");
}
else if(Mood.equals("No")) {
	String MoodT=JOptionPane.showInputDialog("Well, do you want to be happi?");
	if(MoodT.equals("Yes")) {
		JOptionPane.showMessageDialog(null, "Then change something.");
	}
	else {
		JOptionPane.showMessageDialog(null,"Well than keep it up!");	
	}
}
	JOptionPane.showMessageDialog(null, "Birb Birb Birb Birb, Birb is the word.");
	
}
}
