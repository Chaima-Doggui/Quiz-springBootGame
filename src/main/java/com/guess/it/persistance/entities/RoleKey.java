package com.guess.it.persistance.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable

public class RoleKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="id_acteur")
	private String idActeur;
	
	@Column(name="id_film")
	private String idFilm;

	public String getIdActeur() {
		return idActeur;
	}

	public void setIdActeur(String idActeur) {
		this.idActeur = idActeur;
	}

	public String getIdFilm() {
		return idFilm;
	}

	public void setIdFilm(String idFilm) {
		this.idFilm = idFilm;
	}

	
}
