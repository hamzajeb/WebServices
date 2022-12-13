package ma.fstt.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.CarburantDao;
import dao.StationDao;
import metier.Carburant;
import metier.Station;

@Path("/station")
public class StationService {
	@GET
	@Path("/station/{nom}/{adresse}/{ville}")
	@Produces(MediaType.APPLICATION_JSON)
	public void ajouterCarburant(@PathParam(value="nom") String nom,@PathParam(value="adresse") String adresse,@PathParam(value="ville") String ville) {
		StationDao stationDao=new StationDao();
		stationDao.ajouterStation(nom, adresse, ville);
		
	}
	@SuppressWarnings("unchecked")
	@GET
	@Path("/stations")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Station> listCarburants() {
		// TODO Auto-generated method stub
		StationDao stationDao=new StationDao();
		return stationDao.getAllStations();
	}
}
