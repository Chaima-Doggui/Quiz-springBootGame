package persistance.entities;

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

}
