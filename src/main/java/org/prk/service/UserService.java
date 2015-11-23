package org.prk.service;

import org.prk.domain.User;

public interface UserService {

	void addUser(User user);
	boolean validateUser(User user);
}
