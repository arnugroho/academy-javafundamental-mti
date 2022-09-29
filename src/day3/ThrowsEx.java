package day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ThrowsEx {
	public void findFileTry() {
		File newFile = new File("test.txt");
		try {
			FileInputStream stream = new FileInputStream(newFile);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException => " + e.getMessage());
		}
	}
	
	public void findFileThrows() throws ArithmeticException {
		File newFile = new File("test.txt");
		try {
			int a = 40 /0;
			FileInputStream stream = new FileInputStream(newFile);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException => " + e.getMessage());
		}
	}
	
	public void findData() throws NullPointerException, IOException {
		throw new NullPointerException();
	}
	
	public void findDataThrows() {
		try {
			findData();
		} catch (NullPointerException e) {
			System.out.println("NullPointerException => " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException => " + e.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		ThrowsEx t = new ThrowsEx();
		t.findFileThrows();
	}
	
	
	
	

}
