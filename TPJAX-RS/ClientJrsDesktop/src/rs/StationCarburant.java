package rs;

import java.util.Date;




public class StationCarburant {

    private Station station;
 

    private Carburant carburant;
    public StationCarburant() {
		// TODO Auto-generated constructor stub
	}
    public StationCarburant(Station station, Carburant carburant, float prix, Date date) {
		super();
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
}
