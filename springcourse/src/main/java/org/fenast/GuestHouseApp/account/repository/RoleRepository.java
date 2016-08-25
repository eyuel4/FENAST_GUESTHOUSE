package org.fenast.GuestHouseApp.account.repository;

import org.fenast.GuestHouseApp.account.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
