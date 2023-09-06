package com.guess.it.services.interfaces;

import java.util.List;

import com.guess.it.persistance.entities.Role;
import com.guess.it.persistance.entities.RoleKey;

public interface RoleServiceInterface {
	Role saveRole(Role r);

	Role updateRole(Role r);

	void deleteRole(Role r);

	void deleteRoleById(RoleKey id);

	Role getRole(RoleKey id);

	List<Role> getAllRoles();

}
