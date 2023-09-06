package com.guess.it.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guess.it.persistance.entities.Role;
import com.guess.it.persistance.entities.RoleKey;

public interface RoleRepository extends JpaRepository<Role,RoleKey> {

}
