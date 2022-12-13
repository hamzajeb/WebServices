package metier;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="HistoCarb")
public class StationCarburant implements Serializable{
    @EmbeddedId
    private StationCarburantId id=new StationCarburantId();
    
    
    @ManyToOne
    @MapsId("stationId")
    @JoinColumn(name = "station_id")
    private Station station;
 
    @ManyToOne
    @MapsId("carburantId")
    @JoinColumn(name = "carburant_id")
    private Carburant carburant;
    public StationCarburant() {
		// TODO Auto-generated constructor stub
	}
    

	public StationCarburant( Station station, Carburant carburant, float prix, Date date) {
		super();
		this.id = new StationCarburantId(station.getId(), carburant.getId());
		this.station = station;
		this.carburant = carburant;
		this.prix = prix;
		this.date = date;
	}
	private float prix;
    private Date date;
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Carburant getCarburant() {
		return carburant;
	}
	public void setCarburant(Carburant carburant) {
		this.carburant = carburant;
	}
	public Station getStation() {
		return station;
	}
	public void setStation(Station station) {
		this.station = station;
	}
	public StationCarburantId getId() {
		return id;
	}
	public void setId(StationCarburantId id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "StationCarburant [id=" + id + ", station=" + station + ", carburant=" + carburant + ", prix=" + prix
				+ ", date=" + date + "]";
	}
}
