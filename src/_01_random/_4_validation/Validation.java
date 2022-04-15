//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
if(randomNumber == 5)JOptionPane.showMessageDialog(null, "have a lovely day");
		// 2. Repeat all the code above 10 times
else if(randomNumber == 1)JOptionPane.showMessageDialog(null, "I am very tired");
else if(randomNumber == 2)JOptionPane.showMessageDialog(null, "dont do drugs, kids");
else if(randomNumber == 3)JOptionPane.showMessageDialog(null, "death is deadly");
else if(randomNumber == 4)JOptionPane.showMessageDialog(null, "thats ruff buddy");
else if(randomNumber == 6)JOptionPane.showMessageDialog(null, "the best way to not care about your test score is to be so sleep deprived that you dont care");
else if(randomNumber == 7)JOptionPane.showMessageDialog(null, "zzzz.....zzz...zz");
else if(randomNumber == 8)JOptionPane.showMessageDialog(null, "je suis fatigee.");
else if(randomNumber == 9)JOptionPane.showMessageDialog(null, "are you dead inside");
else if(randomNumber == 0)JOptionPane.showMessageDialog(null, "The darkness declares the glory of light. - T. S. Eliot quotes.");
		// 3. Find someone to test out your program. They will like it :)
	}
}
