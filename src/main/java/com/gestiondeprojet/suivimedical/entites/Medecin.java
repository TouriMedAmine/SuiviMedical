package com.gestiondeprojet.suivimedical.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Medecin extends User implements Serializable {
	
	private static final String role ="medecin";
	
	private boolean connected;
	@ManyToOne
	private Admin admin;
	@OneToMany(targetEntity = RendezVous.class, mappedBy = "medecin")
	private List<RendezVous> desRendezVous;
	@OneToMany(targetEntity = Test.class, mappedBy = "medecin")
	private List<Test> tests;
	
	
	public List<RendezVous> getDesRendezVous() {
		return desRendezVous;
	}
	public void setDesRendezVous(List<RendezVous> desRendezVous) {
		this.desRendezVous = desRendezVous;
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
