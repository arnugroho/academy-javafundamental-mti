package day3;

public class TryCatchFinallyEx {
	public static void main(String[] args) {
		try {
			int divideByZero = 5 / 0;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		} finally {
			System.out.println("This is the finally block");
		}
	}

}
