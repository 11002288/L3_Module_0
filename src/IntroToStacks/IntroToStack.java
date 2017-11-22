package IntroToStacks;

import java.awt.Component;
import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		// 1. Create a Stack of Doubles
		// Don't forget to import the Stack class
		Stack<Double> name = new Stack<Double>();
		// 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 101; i++) {
			
			Random ran = new Random();
			Double dubstep = ran.nextDouble() * 100;
			name.push(dubstep);
		}
		// 3. Ask the user to enter in two numbers between 0 and 100, inclusive.
		String num1 = JOptionPane.showInputDialog("Pick a number inbetween 0 and 100");
		String num2 = JOptionPane.showInputDialog("Pick another number inbetween 0 100");
		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);
		// 4. Pop all the elements off of the Stack. Every time a double is popped that
		// is
		// between the two numbers entered by the user, print it to the screen.
		int what = name.size();
		System.out.println("Num 1: " + num1);
		System.out.println("Num 2: " + num2);
		if (number2 >= number1) {
			System.out.println("Popping off Stack Elements between " + num1 + " and " + num2);
		} else {
			System.out.println("Popping off Stack Elements between " + num2 + " and " + num1);
		}
		for (int i = 0; i < what; i++) {
		double la = name.pop();
		if (la >= number1 && la <= number2) {
		System.out.println(la);
		}
		}
		// EXAMPLE:
		// NUM 1: 65
		// NUM 2: 75
		// Popping elements off stack...
		// Elements between 65 and 75:
		// 66.66876846
		// 74.51651681
		// 70.05110654
		// 69.21350456
		// 71.54506465
		// 66.47984807
		// 74.12121224
	}
}
