package Concrete;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService{
	
	private UserCheckService UserCheckService;
	private boolean checkUser = false;

	public UserManager(UserCheckService UserCheckService) {
		this.UserCheckService = UserCheckService;
	}

	@Override
	public void add(User user) throws NumberFormatException, RemoteException {
		if (UserCheckService.checkIfRealPlayer(user)) {
			System.out.println("registration successful");
			System.out.println("Nickname: " + user.getFirstName());
			System.out.println("User E-Mail: " + user.getEmail());
			System.out.println("check your inbox");
			checkUser = true;
		}
		else {
			System.out.println("enter information correctly");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " information deleted");
	}

	
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " information updated.");
	}

	public boolean isCheckUser() {
		return checkUser;
	}

	

	
		
	}


		
	




