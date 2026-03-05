package exceptionhandling;

import java.util.Scanner;
public class Agethrow {
	
	public void checkAge() {
		
		Scanner scd = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int d = scd.nextInt();
		
		if(d < 18) {
			throw new ArithmeticException("Age not found Exception");
		}
		else {
			System.out.println("You can vote ");
		}
		scd.close();
	}

}
