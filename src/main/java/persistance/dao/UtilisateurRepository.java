package persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import persistance.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer>{
	
	
	@Query(value = "select * from patient where login= :login and mdp= :mdp",nativeQuery = true)
    Utilisateur getUserByLM(@Param("login") String login , @Param("mdp") String mdp );

}
