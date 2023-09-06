package com.guess.it.services.interfaces;

import java.util.List;

import com.guess.it.persistance.entities.Acteur;

public interface ActeurServiceInterface {
	Acteur saveActeur(Acteur a);

	Acteur updateActeur(Acteur a);

	void deleteActeur(Acteur a);

	void deleteActeurById(String id);

	Acteur getActeur(String id);

	List<Acteur> getAllActeurs();

}
