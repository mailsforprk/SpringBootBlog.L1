package org.prk.service;

import java.util.ArrayList;
import java.util.List;

import org.prk.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	private static List<User> userList = new ArrayList<User>();
	@Override
	public void addUser(User user) {
		
		userList.add(user);
		
	}

	@Override
	public boolean validateUser(User user) {
		
		return userList.contains(user);
	}

}
