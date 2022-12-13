package rs;

import java.util.List;





public class Carburant {

    private int id;
	private String nom;
	private String description;
	

	public Carburant() {
	// TODO Auto-generated constructor stub
	}
	public Carburant( String nom, String description) {
		
		this.nom = nom;
		this.description = description;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
