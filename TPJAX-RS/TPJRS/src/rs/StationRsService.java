package rs;

import dao.StationDao;
import metier.Station;
import java.util.Date;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;


@Path("/station")
public class StationRsService {

	@Path("/insertionStation")
	 @POST
	public void ajouterStation(String nom,String adresse,String ville) {
		StationDao stationDao=new StationDao();
		stationDao.ajouterStation(nom, adresse, ville);
	}

	
	
	@Path("/listeStations")
	@GET
	public List<Station> listStations() {
		StationDao stationDao=new StationDao();
		return stationDao.getAllStations();
	}

	@Path("/insertionCarburant")
	@POST
	public void ajouterCarb(int id1, int id2, float prix, Date date) {
		StationDao stationDao=new StationDao();
		stationDao.ajouterCarburant(id1, id2, prix, date);
	}



	
	



}
