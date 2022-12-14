package persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import persistance.entities.Role;
import persistance.entities.RoleKey;

public interface RoleRepository extends JpaRepository<Role,RoleKey> {

}
