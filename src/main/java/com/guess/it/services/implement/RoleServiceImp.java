package com.guess.it.services.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guess.it.persistance.dao.RoleRepository;
import com.guess.it.persistance.entities.Role;
import com.guess.it.persistance.entities.RoleKey;
import com.guess.it.services.interfaces.RoleServiceInterface;

@Service
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
