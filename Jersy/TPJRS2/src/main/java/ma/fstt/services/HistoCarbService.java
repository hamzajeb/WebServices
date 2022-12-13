package ma.fstt.services;

import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.CarburantDao;
import dao.StationDao;
import dao.histoCarbDao;
import metier.Station;
import metier.StationCarburant;

@Path("/HistoCarb")
public class HistoCarbService {
	@GET
	@Path("/HistoCarb/{idStation}/{idCarb}/{prix}")
	@Produces(MediaType.APPLICATION_JSON)
	public void ajouterCarburant(@PathParam(value="idStation") int idStation,@PathParam(value="idCarb") int idCarb,@PathParam(value="prix") float prix) {
		histoCarbDao histoCarbDao=new histoCarbDao();
		CarburantDao carburantDao=new CarburantDao();
		StationDao stationDao=new StationDao();
		Date date=new Date();
		histoCarbDao.ajouterHistoCarb(stationDao.getById(idStation), carburantDao.getById(idCarb), prix, date);

		
	}
	@SuppressWarnings("unchecked")
	@GET
	@Path("/HistoCarbs")
	@Produces(MediaType.APPLICATION_JSON)
	public List<StationCarburant> listCarburants() {
		// TODO Auto-generated method stub
		histoCarbDao histoCarbDao=new histoCarbDao();
		return histoCarbDao.getAllStationCarburant();
	}
}
