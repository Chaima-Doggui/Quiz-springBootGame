package services.interfaces;

import java.util.List;

import persistance.entities.Role;
import persistance.entities.RoleKey;

public interface RoleServiceInterface {
	Role saveRole(Role r);

	Role updateRole(Role r);

	void deleteRole(Role r);

	void deleteRoleById(RoleKey id);

	Role getRole(RoleKey id);

	List<Role> getAllRoles();

}
