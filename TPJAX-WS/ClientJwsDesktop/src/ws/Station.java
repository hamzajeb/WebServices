package ws;

import java.util.Date;
import java.util.List;






public class Station {

    private int id;
    private String nom;
    private String adresse;
    private String ville;
//    private List<StationCarburant> carburants;
public Station() {
	// TODO Auto-generated constructor stub
}
	public Station(String nom, String adresse, String ville) {
		
		this.nom = nom;
		this.adresse = adresse;
		this.ville = ville;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
//	public void ajouterCarburant(Carburant c,float prix,Date date) {
//		StationCarburant sc=new StationCarburant(this,c,prix,date);
//		carburants.add(sc);
//		c.getStations().add(sc);
//	}
}
