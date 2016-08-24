package org.fenast.GuestHouseApp.account.repository;

import org.fenast.GuestHouseApp.account.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
