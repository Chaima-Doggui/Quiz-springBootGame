package persistance.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "films_series")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class FilmSerie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(length=20)
	private String id;
	
	@Column(nullable = false)
	private String nom;
	
	@Column(length=500)
	private String plot;
	
	@Column(nullable = false) 
	private String image;
	
	@Column(nullable = false) 
	private String genres;
	
	@Column(nullable = false)
	private String date;
	
	@OneToMany(mappedBy = "filmSerie", cascade= CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Role> roles;

}
