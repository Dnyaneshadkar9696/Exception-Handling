package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MismatchException {

	Scanner sf = new Scanner(System.in);

	public void checkMismatch() {

		try {
			System.out.println("Enter the Integer value : ");
			int a = sf.nextInt();
			System.out.println("You Entered : "+ a);
		}
		catch(InputMismatchException e) {
			System.out.println("Only enter the integer value");
		}

	}

}
