package day3;

public class SingletonDatabase {
	private static SingletonDatabase dbObject;

	//class tidak bisa diibuat dari luar
	private SingletonDatabase() {
	}

	public static SingletonDatabase getInstance() {

		// create object if it's not already created
		if (dbObject == null) {
			dbObject = new SingletonDatabase();
		}

		// returns the singleton object
		return dbObject;
	}

	public void getConnection() {
		System.out.println("You are now connected to the database.");
	}
}
