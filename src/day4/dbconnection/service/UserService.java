package day4.dbconnection.service;

import java.util.ArrayList;

import day4.dbconnection.model.User;
import day4.dbconnection.repository.UserRepo;

public class UserService implements ServiceInterface<User>{
	private UserRepo userRepo = new UserRepo();
	
	@Override
	public void getAll() {
		ArrayList<User> users = userRepo.getAll();
		users.forEach(user->{
			System.out.println("Data User : ");
			System.out.println(user.getIdUser());
			System.out.println(user.getNama());
			System.out.println(user.getAlamat());
		});
	}

	@Override
	public void insert(User obj) {
		userRepo.insert(obj);
		
	}

}
