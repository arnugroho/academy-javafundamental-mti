package day3;

public class MultipleEx {
	public static void main(String[] args) {
		try {
			int array[] = new int[10];
			array[10] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

		try {
			int array[] = new int[10];
			array[10] = 30 / 0;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		try {
			int array[] = new int[10];
			array[10] = 30 / 0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
