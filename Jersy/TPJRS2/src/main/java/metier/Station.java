package metier;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Station implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String adresse;
    private String ville;
	@OneToMany(mappedBy="station",fetch=FetchType.EAGER    , 
	        orphanRemoval = true)
	private List<StationCarburant> carburants;
	public Station() {
		// TODO Auto-generated constructor stub
	}
	public Station(String nom, String adresse, String ville) {
		super();
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
	public List<StationCarburant> getCarburants() {
		return carburants;
	}
	public void setCarburants(List<StationCarburant> carburants) {
		this.carburants = carburants;
	}
}
