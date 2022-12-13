package ws;

import dao.CarburantDao;
import dao.StationDao;
import metier.Station;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService(endpointInterface = "ws.StationWs")
public class StationWsImpl implements StationWs{
//	@Inject
//	StationDao stationDao;
	
	@Override
	public void ajouterStation(String nom,String adresse,String ville) {
		StationDao stationDao=new StationDao();
		stationDao.ajouterStation(nom, adresse, ville);
	}
	
	@Override
	public List<Station> listStations() {
		StationDao stationDao=new StationDao();
		return stationDao.getAllStations();
	}

	@Override
	public void ajouterCarb(int id1, int id2, float prix, Date date) {
		StationDao stationDao=new StationDao();
		stationDao.ajouterCarburant(id1, id2, prix, date);
	}



}
