package tn.esprit.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Agence implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idAgence;
	private int codeAgence;
	private String adresse;
	private String email;
	private int telephone;
	private String chefAgence;
	
	@ManyToOne
	private Banque banque;
	
	@OneToMany
	private List<Compte> lescomptes;
	
	
	public Agence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdAgence() {
		return idAgence;
	}
	public void setIdAgence(long idAgence) {
		this.idAgence = idAgence;
	}
	public int getCodeAgence() {
		return codeAgence;
	}
	public void setCodeAgence(int codeAgence) {
		this.codeAgence = codeAgence;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getChefAgence() {
		return chefAgence;
	}
	public void setChefAgence(String chefAgence) {
		this.chefAgence = chefAgence;
	}
	
	
	
	
}
