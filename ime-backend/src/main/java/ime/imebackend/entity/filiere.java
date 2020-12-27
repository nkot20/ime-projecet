package ime.imebackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@Entity
@Table(name="filiere")
@ToString
public class filiere {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_filiere;
	private String intitule;
	public Long getId_filiere() {
		return id_filiere;
	}
	public void setId_filiere(Long id_filiere) {
		this.id_filiere = id_filiere;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	

}
