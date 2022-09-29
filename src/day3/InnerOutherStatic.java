package day3;

public class InnerOutherStatic {
	// static nested class
	String model;

	public InnerOutherStatic(String model) {
		this.model = model;
	}

	// static nested class
	static class USB {
		int usb2 = 2;
		int usb3 = 1;

		int getTotalPorts() {
			// accessing the variable model of the outer classs
			if (new InnerOutherStatic("Lenovo").model.equals("MSI")) {
				return 4;
			} else {
				return usb2 + usb3;
			}
		}
	}

	public static void main(String[] args) {

		// create an object of the static nested class
		// using the name of the outer class
		InnerOutherStatic.USB usb = new InnerOutherStatic.USB();
		System.out.println("Total Ports = " + usb.getTotalPorts());
	}
}
