package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Transaction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idTransaction;
	private Date dateTransaction;
	private float montant;
	@ManyToOne
	private Historique historique;
	@ManyToOne
	private Compte compte;
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdTransaction() {
		return idTransaction;
	}
	public void setIdTransaction(long idTransaction) {
		this.idTransaction = idTransaction;
	}
	public Date getDateTransaction() {
		return dateTransaction;
	}
	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}
	public float getMontant() {
		return montant;
	}
	public void setMontant(float montant) {
		this.montant = montant;
	}
	
	
	
	

}
