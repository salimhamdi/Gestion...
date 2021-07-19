package tn.esprit.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity

public class Intervention implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idIntervention;
	@Enumerated(EnumType.STRING)
	private TypeIntervention typeintervention ;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Client> client;
	public Intervention() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdIntervention() {
		return idIntervention;
	}
	public void setIdIntervention(long idIntervention) {
		this.idIntervention = idIntervention;
	}
	public TypeIntervention getTypeintervention() {
		return typeintervention;
	}
	public void setTypeintervention(TypeIntervention typeintervention) {
		this.typeintervention = typeintervention;
	}
	

}
