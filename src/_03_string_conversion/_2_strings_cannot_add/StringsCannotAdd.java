package _03_string_conversion._2_strings_cannot_add;

import javax.swing.JOptionPane;

public class StringsCannotAdd {

		// 1) Make a main method that includes all the steps below…. 
	  public static void main(String[] args) {
		
	
			// 2) Ask the user to enter number 4 and hold it in the variable fourAsString 
	String fourAsString =  JOptionPane.showInputDialog(null,"pls enter number 4");
			// 3) Ask the user to enter number 6 and hold it in the variable sixAsString 
	String sixAsString =  JOptionPane.showInputDialog(null,"pls enter number 6");
			// 4) Print the addition of fourAsString and sixAsString using JOptionPane 
	String vaar3 = fourAsString + sixAsString; 
	JOptionPane.showMessageDialog(null,vaar3);
			// Did you notice 46 instead of 4 + 6 = 10
JOptionPane.showMessageDialog(null,"did you notice it was 46 instead of 4 + 6 = 10");
			// 5) Ask the user to enter number 5 and hold it in the variable fiveAsString 
String fiveAsString =  JOptionPane.showInputDialog(null,"pls enter number 5");
			// 6) Print the addition of the variables fourAsString, sixAsString, and fiveAsString 
String vaar4 = fourAsString + sixAsString + fiveAsString; 
JOptionPane.showMessageDialog(null,vaar4);
			//Did you notice 456 instead of 4 + 6 + 5 = 15?
JOptionPane.showMessageDialog(null,"did you notice it was 465 instead of 4 + 6 + 5 = 15");
			// Insert fourAsString inside the parenthesis of Integer.parseInt() and set the method equal to fourAsInt
			// Hint: int fourAsInt = Integer.parseInt(fourAsString);
int fourAsInt = Integer.parseInt(fourAsString);
			// 7) Do the same for sixAsString. 
int sixAsInt = Integer.parseInt(sixAsString);
			// 8) Print the addition of fourAsInt and sixAsInt using JOptionPane 
int vaar5 = fourAsInt + sixAsInt; 
JOptionPane.showMessageDialog(null,vaar5);
			// Did you notice the value 10? If so, hurray! You just changed the type of your variable from String to int.
			
			// 9) Convert fiveAsString to fiveAsInt using Integer.parseInt();  
int fiveAsInt = Integer.parseInt(fiveAsString);
			// 10) Print the addition of fourAsInt, sixAsInt, and fiveAsInt using JOptionPane 
int vaar6 = fourAsInt + sixAsInt + fiveAsInt; 
JOptionPane.showMessageDialog(null,vaar6);
			// Is your value now 15 instead of 465?
}
}