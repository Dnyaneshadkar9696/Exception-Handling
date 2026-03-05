package exceptionhandling;

public class ExtentHellow extends HellowThrows{
	
	
	public void gen()  {
		try {
			Class.forName("java.lang.String");
		}
		catch(ClassNotFoundException e) {
			System.out.println("The class not found");
		}
		
		try {
			super.div();
		} catch (Exception e) {
			
			System.out.println("Cannot divide by zero");
		}
	}
	
	

}
