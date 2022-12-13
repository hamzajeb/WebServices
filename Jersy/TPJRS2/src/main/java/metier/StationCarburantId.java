package metier;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StationCarburantId implements Serializable {

 
    @Column(name = "station_id")
    private int stationId;


    @Column(name = "carburant_id")
    private int carburantId;
    public StationCarburantId() {
		// TODO Auto-generated constructor stub
	}
	public StationCarburantId(int stationId, int carburantId) {
		super();
		this.stationId = stationId;
		this.carburantId = carburantId;
	}

	public int getStationId() {
		return stationId;
	}

	public void setStationId(int stationId) {
		this.stationId = stationId;
	}

	public int getCarburantId() {
		return carburantId;
	}

	public void setCarburantId(int carburantId) {
		this.carburantId = carburantId;
	}
}
