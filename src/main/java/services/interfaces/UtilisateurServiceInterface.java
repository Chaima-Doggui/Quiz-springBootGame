package services.interfaces;

import java.util.List;

import persistance.entities.Utilisateur;

public interface UtilisateurServiceInterface {
	Utilisateur saveUtilisateur(Utilisateur u);

	Utilisateur updateUtilisateur(Utilisateur u);

	void deleteUtilisateur(Utilisateur u);

	void deleteUtilisateurById(Integer id);

	Utilisateur getUtilisateur(Integer id);

	List<Utilisateur> getAllUtilisateurs();

}
