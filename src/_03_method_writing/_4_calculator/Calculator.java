package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	//GOAL: MAKE A CALCULATOR
	static int result;
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);

		// 3) Call the correct method depending on what option the user chooses
		if(task == 0) {
			divide(number1, number2);
		} else if (task == 1) {
			multiply(number1, number2);
		} else if (task == 2) {
			subtract(number1, number2);
		} else {
			add(number1, number2);
		}
		// 4) Call the result() method and put the answer in a pop-up
		result();
	}
	
	// 1) Make 4 static methods (add, subtract, multiply, divide)
	//		They should each take 2 numbers as parameters
	//		and return the answer.
	static void add(int one, int two) {
		result = one + two;
	}
	static void subtract(int one, int two) {
		result = one - two;
	}
	static void multiply(int one, int two) {
		result = one * two;
	}
	static void divide(int one, int two) {
		result = one / two;
	}

	// 2) Make a static method called " result" that takes a number
	//		as a parameter and returns the number in a string
	//		EX: "Your answer is " + number;
	static void result() {
		JOptionPane.showMessageDialog(null, "Your answer is " + result, "Calculator", 1);
	}	
}
