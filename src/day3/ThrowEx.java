package day3;

public class ThrowEx {
	public static void main(String[] args) {
		try {
			throw new ArithmeticException("Terjadi kesalahan aritmatika");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		} finally {
			System.out.println("This is the finally block");
		}
	}

}
