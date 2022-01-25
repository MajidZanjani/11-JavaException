package exceptionHandlingOverriding;

class Parent {
	void exMessage() throws Exception {
		System.out.println("Parent Class");
	}
}

public class ExceptionHandlingOverriding extends Parent {

	// Exception overriding should be the child exception of the parent exception
	// ArithmeticException -> Exception
	// ArithmeticException -> ArithmeticException
	// Exception -> Exception
	// Exception -> ArithmeticException **** NOT ALLOWED ****
	void exMessage() throws ArithmeticException { 
		System.out.println("Child Class");
	}
	
	public static void main(String[] args) {
		Parent childParent = new ExceptionHandlingOverriding();
		try {
			childParent.exMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
