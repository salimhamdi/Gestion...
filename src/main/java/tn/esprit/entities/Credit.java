package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Credit implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private long idCredit;
	private float montantCredit;
	private int dureeCredit;
	private int tauxCredit;
	private int tauxDeRisque;
	@Enumerated(EnumType.STRING)
	private TypeCredit typecredit;
	@OneToOne
	private Client client;
	public Credit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdCredit() {
		return idCredit;
	}
	public void setIdCredit(long idCredit) {
		this.idCredit = idCredit;
	}
	public float getMontantCredit() {
		return montantCredit;
	}
	public void setMontantCredit(float montantCredit) {
		this.montantCredit = montantCredit;
	}
	public int getDureeCredit() {
		return dureeCredit;
	}
	public void setDureeCredit(int dureeCredit) {
		this.dureeCredit = dureeCredit;
	}
	public int getTauxCredit() {
		return tauxCredit;
	}
	public void setTauxCredit(int tauxCredit) {
		this.tauxCredit = tauxCredit;
	}
	public int getTauxDeRisque() {
		return tauxDeRisque;
	}
	public void setTauxDeRisque(int tauxDeRisque) {
		this.tauxDeRisque = tauxDeRisque;
	}
	public TypeCredit getTypecredit() {
		return typecredit;
	}
	public void setTypecredit(TypeCredit typecredit) {
		this.typecredit = typecredit;
	}
	
	

}
