package exceptionhandling;
import java.util.Scanner;
public class Multicatch {
	
	public void multicatchBlocks() {
		
		Scanner sd = new Scanner(System.in);
		
		
		try {
			Class.forName("java.lang.String");
			System.out.println("Enter two numbers: ");
			int a = sd.nextInt();
			int b = sd.nextInt();
			int c = a / b;
			System.out.println("Division is : "+ c);
			
		}
		catch(ArithmeticException d) {
			System.out.println("The class is not found");
		}
		catch(ClassNotFoundException e) {
			System.out.println("The Class Not Found");
		}
		finally {
			sd.close();
		}
		
		
	}

}
