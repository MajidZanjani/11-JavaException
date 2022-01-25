package throwsExceptionExample;

public class ThrowsExceptionExample {

	public static int myDivider (int a, int b) throws ArithmeticException {
		int myDivider = a / b;
		return myDivider;
	}
	
	public static void main(String[] args) {
		
		try {
			
			ThrowsExceptionExample myExample = new ThrowsExceptionExample();
			int result = myExample.myDivider(5, 0); // if you change zero, you get the result without exception
			System.out.println(result);
			
		} catch (ArithmeticException e) {
			
			System.out.println("\nDividing by zero is not acceptable.");
			
		}
		
		System.out.println("\nRest of the code.");
	}

}
