package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PackProduit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private long idPack;
	private String typePack;
	
	@ManyToOne
	private Banque banque;
	
	
	public PackProduit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdPack() {
		return idPack;
	}
	public void setIdPack(long idPack) {
		this.idPack = idPack;
	}
	public String getTypePack() {
		return typePack;
	}
	public void setTypePack(String typePack) {
		this.typePack = typePack;
	}
	
	
	
}
