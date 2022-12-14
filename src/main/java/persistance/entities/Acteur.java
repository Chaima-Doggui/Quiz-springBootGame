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
@Table(name = "Acteurs")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Acteur implements Serializable {

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
	private String image;
	
	@OneToMany(mappedBy = "acteurs", cascade= CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Role> roles;
}
