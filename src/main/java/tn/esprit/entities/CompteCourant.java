package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class CompteCourant extends Compte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private float decouvert;
	private  TypeCheque typeCheque;
	
	@OneToOne
	private Carte carte;
	
	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public float getDecouvert() {
		return decouvert;
	}
	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}
	public TypeCheque getTypeCheque() {
		return typeCheque;
	}
	public void setTypeCheque(TypeCheque typeCheque) {
		this.typeCheque = typeCheque;
	}
	
	

}
