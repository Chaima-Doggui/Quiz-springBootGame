package persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import persistance.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer>{

}
