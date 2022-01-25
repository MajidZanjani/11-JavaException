package exceptionPropagation;

public class ExceptionPropagation {

	static void myFirstVoid() {
		int i = 1/0;
	}
	
	static void mySecondVoid() {
		myFirstVoid();
	}

	static void myThirdVoid() {
		try {
			mySecondVoid();			
		} catch (Exception e) {
			System.out.println("Exception has been handled.");
		}

	}
	
	public static void main(String[] args) {

		myThirdVoid();
		System.out.println("End of the Code.");

	}

}
