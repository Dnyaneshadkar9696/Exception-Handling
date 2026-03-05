package exceptionhandling;

import java.util.Scanner;

public class NumberDiv {

	Scanner sc = new Scanner(System.in);

	public void divisionNum() {
		
		System.out.println("Enter two numbers for division : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			int c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			
			// when the exception occurs it directly goes to the catch block.
			System.out.println("This is not allowed in java");
			
		}
		
	}

}
