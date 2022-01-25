package throwExceptionExample;

public class ThrowExceptionExample {

	static class MyException extends Exception {
		public MyException (String exp) {
			super(exp);
		}		
	}
	
	public static void main(String[] args) {
		
		try {
			throw new MyException("This is a throw testing.");
		} catch (MyException myExp) {
			System.out.println(myExp.getMessage());
		}

	}
}
