package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Reclamation implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idReclamation;
	private String decription;
	@ManyToOne
	private Client client;
	public Reclamation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdReclamation() {
		return idReclamation;
	}
	public void setIdReclamation(long idReclamation) {
		this.idReclamation = idReclamation;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	

}
