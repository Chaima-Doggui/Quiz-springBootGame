package persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import persistance.entities.Acteur;

public interface ActeurRepository extends JpaRepository <Acteur,String> {

}
