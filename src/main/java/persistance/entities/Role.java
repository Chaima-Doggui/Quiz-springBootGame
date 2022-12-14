package persistance.entities;

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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "role")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
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

}
