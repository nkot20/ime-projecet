package ime.imebackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@Entity
@Table(name="niveau")
@ToString
public class niveau {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_niveau;
	private String intitule;
	public Long getId_niveau() {
		return id_niveau;
	}
	public void setId_niveau(Long id_niveau) {
		this.id_niveau = id_niveau;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	
	
}
