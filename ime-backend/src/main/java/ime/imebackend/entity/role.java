package ime.imebackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@Entity
@Table(name="role")
@ToString
public class role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idrole;
	private String intitule;
	
	/*
	 * @OneToMany(cascade = CascadeType.ALL, mappedBy="role") private Set<user>
	 * user;
	 */

	public Long getIdrole() {
		return idrole;
	}

	public void setIdrole(Long idrole) {
		this.idrole = idrole;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	/*
	 * public Set<user> getUser() { return user; }
	 * 
	 * public void setUser(Set<user> user) { this.user = user; }
	 */
	
	

}
