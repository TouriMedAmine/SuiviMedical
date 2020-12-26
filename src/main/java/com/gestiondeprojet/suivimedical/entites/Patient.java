package com.gestiondeprojet.suivimedical.entites;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Patient extends User implements Serializable{
	public enum TypeSang{
		A_POSITIF, A_NEGATIF, B_POSITIF, B_NEGATIF, AB_POSITIF, AB_NEGATIF, O_POSITIF, O_NEGATIF 
	}
	
	
	private static final String role ="patient";
	private String cin;
	private SimpleDateFormat dateNaissance; 
	private boolean sexePatient;
	private TypeSang typeSang;
	private String adresse;
	@ManyToOne
	private Admin admin;
	private boolean connected;
	@OneToMany(targetEntity = RendezVous.class, mappedBy = "patient")
	private List<RendezVous> desRendezVous;
	@OneToMany(targetEntity = Test.class, mappedBy = "patient")
	private List<Test> tests;
	
	
	public List<RendezVous> getDesRendezVous() {
		return desRendezVous;
	}
	public void setDesRendezVous(List<RendezVous> desRendezVous) {
		this.desRendezVous = desRendezVous;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public SimpleDateFormat getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(SimpleDateFormat dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public boolean isSexePatient() {
		return sexePatient;
	}
	public void setSexePatient(boolean sexePatient) {
		this.sexePatient = sexePatient;
	}
	public TypeSang getTypeSang() {
		return typeSang;
	}
	public void setTypeSang(TypeSang typeSang) {
		this.typeSang = typeSang;
	}
	public boolean isConnected() {
		return connected;
	}
	public void setConnected(boolean connected) {
		this.connected = connected;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public static String getRole() {
		return role;
	}
}
