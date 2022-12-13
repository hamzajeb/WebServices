package metier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Carburant implements Serializable{
	@Override
	public String toString() {
		return "Carburant [id=" + id + ", nom=" + nom + ", description=" + description + ", stations=" + stations + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	private String nom;
	private String description;
	@OneToMany(mappedBy="carburant",fetch=FetchType.EAGER,        cascade = { CascadeType.ALL},
	        orphanRemoval = true)
	private List<StationCarburant> stations= new ArrayList<>();
	public Carburant() {
		// TODO Auto-generated constructor stub
	}

	public Carburant( String nom, String description) {
		super();
		
		this.nom = nom;
		this.description = description;
		this.stations = stations;
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
	public List<StationCarburant> getStations() {
		return stations;
	}
	public void setStations(List<StationCarburant> stations) {
		this.stations = stations;
	}
	

}
