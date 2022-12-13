package rs;

import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import dao.histoCarbDao;
import metier.Carburant;
import metier.Station;
import metier.StationCarburant;


@Path("/histoCarburant")
public class HistoCarbRsService{

	@Path("/insertionHistoCarburant")
	 @POST
	public void ajouterHistoCarb(Station station, Carburant carb, float prix, Date date) {
		histoCarbDao h=new histoCarbDao();
		
		h.ajouterHistoCarb(station, carb, prix, date);
		
	}

	 @GET
		@Path("/listeHistoCarburant")
	public List<StationCarburant> listHistoCarb() {
		histoCarbDao h=new histoCarbDao();
		return h.getAllStationCarburant();
	}

	



}
