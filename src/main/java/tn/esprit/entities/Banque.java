package tn.esprit.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Banque implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idBanque;
	private String nomBanque;
	private String adresseBanque;
	private String email;
	private int telephone;
	private int fax;
	
	@OneToMany(mappedBy="banque")
	private List<PackProduit> packproduits;
	
	@OneToMany(mappedBy="banque")
	private List<Agence> LesAgences;
	
	
	public Banque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getIdBanque() {
		return idBanque;
	}

	public void setIdBanque(long idBanque) {
		this.idBanque = idBanque;
	}

	public String getNomBanque() {
		return nomBanque;
	}

	public void setNomBanque(String nomBanque) {
		this.nomBanque = nomBanque;
	}

	public String getAdresseBanque() {
		return adresseBanque;
	}

	public void setAdresseBanque(String adresseBanque) {
		this.adresseBanque = adresseBanque;
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

	public int getFax() {
		return fax;
	}

	public void setFax(int fax) {
		this.fax = fax;
	}
	
	
	
}
