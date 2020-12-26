package com.gestiondeprojet.suivimedical.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Test {
	@Id @GeneratedValue
	private long id;
	private String description;
	@ManyToOne
	private Patient patient;
	@ManyToOne
	private Medecin medecin;
	@ManyToOne
	private RendezVous rendezVous;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	public RendezVous getRendezVous() {
		return rendezVous;
	}
	public void setRendezVous(RendezVous rendezVous) {
		this.rendezVous = rendezVous;
	}
	
	

}
