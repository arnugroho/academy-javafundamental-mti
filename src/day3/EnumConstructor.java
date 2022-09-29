package day3;

public enum EnumConstructor {
	// enum constants calling the enum constructors
	SMALL(0, "small"),
	MEDIUM(1, "medium"), 
	LARGE(2, "large"),
	EXTRALARGE(3, "extralarge");

	private final Integer sizeInt;
	private final String name;

	// private enum constructor
	private EnumConstructor(Integer sizeInt, String name) {
	      this.sizeInt = sizeInt;
	      this.name = name;
	   }

	public Integer getSizeInt() {
		return sizeInt;
	}
	
	public String getName() {
		return name;
	}
}
