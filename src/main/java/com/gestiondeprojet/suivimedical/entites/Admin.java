package com.gestiondeprojet.suivimedical.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Admin extends User implements Serializable{
	
	private static final String role ="admin";
	private boolean connected;
	@OneToMany(targetEntity = Medecin.class, mappedBy = "admin")
	private List<Medecin> medecins;
	@OneToMany(targetEntity = Patient.class, mappedBy = "admin")
	private List<Patient> patients;
	
	
	public boolean isConnected() {
		return connected;
	}
	public void setConnected(boolean connected) {
		this.connected = connected;
	}
	public List<Medecin> getMedecins() {
		return medecins;
	}
	public void setMedecins(List<Medecin> medecins) {
		this.medecins = medecins;
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	public static String getRole() {
		return role;
	}
	

}
