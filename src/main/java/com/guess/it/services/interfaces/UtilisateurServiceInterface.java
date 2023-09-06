package com.guess.it.services.interfaces;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.guess.it.persistance.entities.Utilisateur;

public interface UtilisateurServiceInterface {
	Utilisateur saveUtilisateur(Utilisateur u);

	Utilisateur updateUtilisateur(Utilisateur u);

	void deleteUtilisateur(Utilisateur u);

	void deleteUtilisateurById(Integer id);

	Utilisateur getUtilisateur(Integer id);

	List<Utilisateur> getAllUtilisateurs();
	
    Utilisateur getUserByLM(String login ,String mdp );


}
