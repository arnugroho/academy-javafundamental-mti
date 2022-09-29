package day4.dbconnection;

import day4.dbconnection.model.User;
import day4.dbconnection.service.UserService;

public class RunDB {
	public static void main(String[] args) {
		UserService userService = new UserService();
		userService.getAll();
		User user = new User();
//		user.setIdUser(4);
//		user.setNama("tono");
//		user.setAlamat("bandung");
//		userService.insert(user);
	}
}
