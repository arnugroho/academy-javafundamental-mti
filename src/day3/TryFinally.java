package day3;

public class TryFinally {
	public static void main(String[] args) {
		try {
			int divideByZero = 5 / 0;
		} finally {
			System.out.println("This is the finally block");
		}
	}
}
