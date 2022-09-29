package day3;

public class InnerOuterNonStatic {
	String carName;
	String carType;

	// assign values using constructor
	public InnerOuterNonStatic(String name, String type) {
		this.carName = name;
		this.carType = type;
	}

	// private method
	private String getCarName() {
		return this.carName;
	}

// inner class
	class Engine {
		String engineType;

		void setEngine() {

			// Accessing the carType property of Car
			if (InnerOuterNonStatic.this.carType.equals("4WD")) {

				// Invoking method getCarName() of Car
				if (InnerOuterNonStatic.this.getCarName().equals("Crysler")) {
					this.engineType = "Smaller";
				} else {
					this.engineType = "Bigger";
				}

			} else {
				this.engineType = "Bigger";
			}
		}

		String getEngineType() {
			return this.engineType;
		}
	}

	public static void main(String[] args) {

// create an object of the outer class Car
		InnerOuterNonStatic car1 = new InnerOuterNonStatic("Mazda", "8WD");

		// create an object of inner class using the outer class
		InnerOuterNonStatic.Engine engine = car1.new Engine();
		engine.setEngine();
		System.out.println("Engine Type for 8WD= " + engine.getEngineType());

		InnerOuterNonStatic car2 = new InnerOuterNonStatic("Crysler", "4WD");
		InnerOuterNonStatic.Engine c2engine = car2.new Engine();
		c2engine.setEngine();
		System.out.println("Engine Type for 4WD = " + c2engine.getEngineType());
	}
}
