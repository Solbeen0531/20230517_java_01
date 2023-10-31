package chapter4_practicexample;

public class FourOperator {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';

		// if-else문 사용
		System.out.println("==if-else문 사용==");
		if (operator == '+') {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		} else if (operator == '-') {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

		} else if (operator == '*') {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

		} else if (operator == '/') {
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

		} 
		
		// switch-case문 사용
		System.out.println("\n==switch-case문 사용==");
		switch (operator) {
		case '+' :
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case '-' :
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case '*' :
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case '/' :
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			break;
			
		}

	}

}
