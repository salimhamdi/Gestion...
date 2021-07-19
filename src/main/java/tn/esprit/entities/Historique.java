package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Historique implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idHistorique;
	private Date dateHistorique;
	private String operation ;
	private float solde;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="historique")
	private List<Transaction> transactions ;
	
	@OneToOne(mappedBy="historique")
	private Compte compte;
	
	
	public Historique() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdHistorique() {
		return idHistorique;
	}
	public void setIdHistorique(long idHistorique) {
		this.idHistorique = idHistorique;
	}
	public Date getDateHistorique() {
		return dateHistorique;
	}
	public void setDateHistorique(Date dateHistorique) {
		this.dateHistorique = dateHistorique;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	
	
	

}
