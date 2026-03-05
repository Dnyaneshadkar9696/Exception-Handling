package exceptionhandling;

import javax.naming.ldap.ExtendedRequest;

public class Controll {
	
	public static void main(String[] args)   {
		
		NumberDiv d = new NumberDiv();
		d.divisionNum();
		
		MismatchException m = new MismatchException();
		m.checkMismatch();
		
		Multicatch md = new Multicatch();
		md.multicatchBlocks();
		
		CustomException dc = new CustomException();
		dc.ownExecption();
		
		Agethrow sd = new Agethrow();
		sd.checkAge();
		
		ExtentHellow ed = new ExtentHellow();
		ed.div();
		// here it will give error as we have not handled the exception when it first occurs
		
		ed.gen();
		
	}

}
