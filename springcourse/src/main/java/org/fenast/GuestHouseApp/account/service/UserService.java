package org.fenast.GuestHouseApp.account.service;

import org.fenast.GuestHouseApp.account.model.User;

public interface UserService {
	void save(User user);
	
	User findByUsername(String username);
}
