package com.guess.it.persistance.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "role")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private RoleKey id;
	
	@ManyToOne() // many roles to one actor : donc on doit définir l actor
	@MapsId("idActeur") //java
	@JoinColumn(name="id_acteur") //bd
	private Acteur acteurs;
	
	@ManyToOne()
	@MapsId("idFilm")
	@JoinColumn(name="id_film")
	private FilmSerie filmSerie;
	
	@Column(nullable = false)
	private String personnage;

	
	public String getPersonnage() {
		return personnage;
	}

	public void setPersonnage(String personnage) {
		this.personnage = personnage;
	}
	

}
