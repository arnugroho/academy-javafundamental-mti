package day3;

public class CustomException extends RuntimeException {

	public CustomException(String errorMessage) {
        super(errorMessage);
        System.out.println("custom exception data");
    }

}
