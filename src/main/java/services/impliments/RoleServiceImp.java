package services.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import persistance.dao.RoleRepository;
import persistance.entities.Role;
import persistance.entities.RoleKey;
import services.interfaces.RoleServiceInterface;

public class RoleServiceImp implements RoleServiceInterface {
	
	
	@Autowired
	RoleRepository RoleRepository;
	
	
	@Override
	public Role saveRole(Role r) {
		// TODO Auto-generated method stub
		return RoleRepository.save(r);
	}

	@Override
	public Role updateRole(Role r) {
		// TODO Auto-generated method stub
		return RoleRepository.saveAndFlush(r);
	}

	@Override
	public void deleteRole(Role r) {
		RoleRepository.delete(r);
	}

	@Override
	public void deleteRoleById(RoleKey id) {
		RoleRepository.deleteById(id);
	}

	@Override
	public Role getRole(RoleKey id) {
		// TODO Auto-generated method stub
		return RoleRepository.findById(id).get();
	}

	@Override
	public List<Role> getAllRoles() {
		// TODO Auto-generated method stub
		return RoleRepository.findAll();
	}

}
