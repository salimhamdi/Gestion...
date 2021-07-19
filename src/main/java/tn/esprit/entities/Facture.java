package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Facture implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private long reference;
	private Date dateDeFactoration;
	private Date dateDePaiement;
	@Enumerated(EnumType.STRING)
	private Libelle libelle;
	@ManyToOne
	private Client client;
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getReference() {
		return reference;
	}
	public void setReference(long reference) {
		this.reference = reference;
	}
	public Date getDateDeFactoration() {
		return dateDeFactoration;
	}
	public void setDateDeFactoration(Date dateDeFactoration) {
		this.dateDeFactoration = dateDeFactoration;
	}
	public Date getDateDePaiement() {
		return dateDePaiement;
	}
	public void setDateDePaiement(Date dateDePaiement) {
		this.dateDePaiement = dateDePaiement;
	}
	public Libelle getLibelle() {
		return libelle;
	}
	public void setLibelle(Libelle libelle) {
		this.libelle = libelle;
	}
	
	

}
