package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Carte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idCarte;
	
	private int CodeCarte;
	private int numero;
	
	@OneToOne(mappedBy="carte")
	private CompteCourant compte;
	
	public Carte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getIdCarte() {
		return idCarte;
	}

	public int getCodeCarte() {
		return CodeCarte;
	}

	public void setCodeCarte(int codeCarte) {
		CodeCarte = codeCarte;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
