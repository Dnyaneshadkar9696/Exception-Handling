package exceptionhandling;

import java.util.Scanner;

public class CustomException {

	Scanner sdf = new Scanner(System.in);

	public void ownExecption() {

		System.out.println("Enter the number : ");
		int a = sdf.nextInt();
		throw new ArithmeticException("NegativeNumberException");

	}

}
