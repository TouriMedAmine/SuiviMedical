package com.gestiondeprojet.suivimedical.entites;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class RendezVous {
	@Id @GeneratedValue
	private long id;
	private SimpleDateFormat dateRDV;
	private String heureRDV;
	private String Description;
	@ManyToOne
	private Patient patient;
	@ManyToOne
	private Medecin medecin;
	@OneToMany(targetEntity = Test.class, mappedBy = "rendezVous")
	private List<Test> tests;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public SimpleDateFormat getDateRDV() {
		return dateRDV;
	}
	public void setDateRDV(SimpleDateFormat dateRDV) {
		this.dateRDV = dateRDV;
	}
	public String getHeureRDV() {
		return heureRDV;
	}
	public void setHeureRDV(String heureRDV) {
		this.heureRDV = heureRDV;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	
	

}
