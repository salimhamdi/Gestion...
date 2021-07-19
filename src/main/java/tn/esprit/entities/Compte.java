package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Compte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idCompte;
	private float soldeCompte;
	private Date dateCreationCompte;
	private int Rib;
	private String typeCompte;
	private String etatCompte;
	
	@ManyToOne
	private Agence agence;
	@ManyToOne
	private Client client;
	
	@OneToOne
	private Historique historique;
    
	@OneToMany(mappedBy="compte")
	private List<Transaction> transactions;
	
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(long idCompte) {
		this.idCompte = idCompte;
	}
	public float getSoldeCompte() {
		return soldeCompte;
	}
	public void setSoldeCompte(float soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
	public Date getDateCreationCompte() {
		return dateCreationCompte;
	}
	public void setDateCreationCompte(Date dateCreationCompte) {
		this.dateCreationCompte = dateCreationCompte;
	}
	public int getRib() {
		return Rib;
	}
	public void setRib(int rib) {
		Rib = rib;
	}
	public String getTypeCompte() {
		return typeCompte;
	}
	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}
	public String getEtatCompte() {
		return etatCompte;
	}
	public void setEtatCompte(String etatCompte) {
		this.etatCompte = etatCompte;
	}
	
	
	
	
	

}
