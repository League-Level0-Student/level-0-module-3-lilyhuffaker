
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = " Septamber 30";
		String dadsBirthday = " march 16";
		String myBirthday = " June 27";
		String brothersBirthday = " May 30";
String name=JOptionPane.showInputDialog("Who's birthday woyuld y'all like to know 'bout?");
if(name.equals("Mom")) {
	JOptionPane.showMessageDialog(null, "Mom's birthday is on"+momsBirthday);
}
else if(name.equals("Dad")) {
	JOptionPane.showMessageDialog(null, "Dad's birthday is"+dadsBirthday);
}
else if(name.equals("Lily")||name.equals("Me")) {
	JOptionPane.showMessageDialog(null, "Lily's birthday is"+myBirthday);
}
else if(name.equals("Cole")) {
	JOptionPane.showMessageDialog(null, "Cole's birthday is"+brothersBirthday);
}
else {
	JOptionPane.showMessageDialog(null, "sorry, we couldnt find that birthday...plz try again.");
}
	} 
}
