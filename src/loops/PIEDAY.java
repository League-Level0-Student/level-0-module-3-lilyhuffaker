package loops;

import javax.swing.JOptionPane;

public class PIEDAY {
public static void main(String[] args) {
	String Pi=("3.1415926");
	System.out.print("Pi");
	for(int i=0;i<4;i++) {
		System.out.print(Pi.charAt(i));
	}
	
	for(int i=4;i<Pi.length();i++) {
		String guess=JOptionPane.showInputDialog("What is the next digit of Pi?");
		if(guess.equals(Character.toString(Pi.charAt(i)))) {
			JOptionPane.showMessageDialog(null, "Nice.");
			System.out.print(Pi.charAt(i));
		}
		else {
			JOptionPane.showMessageDialog(null, "NO PIE FOR YOU MISTER!");
		}
	}
	JOptionPane.showMessageDialog(null, "Nice! You know all the didgits of Pi! just k,idding, \n there are many more number in Pi than that!");
	
}
}
