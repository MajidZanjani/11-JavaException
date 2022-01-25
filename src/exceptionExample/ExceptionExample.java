package exceptionExample;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			
			System.out.print("Enter the first Integer number:");
			float firstNumber = scanner.nextInt();
			System.out.print("Enter the second Integer number:");
			float secondNumber = scanner.nextInt();
			float result = firstNumber/secondNumber;
			System.out.printf("%.3f", result);

		} catch (Exception e) {
		
			System.out.println("Something is wrong with your numbers. Please check.");

		} finally {
			
			System.out.println("\nFinally block."); // Executed always!

		}

	}

}
