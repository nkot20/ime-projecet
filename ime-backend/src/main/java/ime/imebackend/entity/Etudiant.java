package ime.imebackend.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.ToString;

@Entity
@Table(name="etudiant")
@ToString
public class Etudiant {

	@Id
	private String matricule_etu;
	private String nom; 
	private String prenom;
	private Date date_nais;
	private String lieu;
	private String email;
	private int tel;
	private String pw;
	private String annee_aca;
	private int etatinscription;
	
	@ManyToOne
	@JoinColumn(name = "id_filiere", nullable = true)
	private filiere filiere;
	
	@ManyToOne
	@JoinColumn(name = "id_niveau", nullable = false)
	private niveau niveau;

	public String getMatricule_etu() {
		return matricule_etu;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDate_nais() {
		return date_nais;
	}

	public void setDate_nais(Date date_nais) {
		this.date_nais = date_nais;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getAnnee_aca() {
		return annee_aca;
	}

	public void setAnnee_aca(String annee_aca) {
		this.annee_aca = annee_aca;
	}

	public filiere getId_filiere() {
		return filiere;
	}

	public void setId_filiere(filiere filiere) {
		this.filiere = filiere;
	}

	public niveau getId_niveau() {
		return niveau;
	}

	public void setId_niveau(niveau niveau) {
		this.niveau = niveau;
	}

	public int getEtatinscription() {
		return etatinscription;
	}

	public void setEtatinscription(int etatinscription) {
		this.etatinscription = etatinscription;
	}
	
	
}
