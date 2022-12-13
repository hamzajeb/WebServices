package ws;

import java.util.Date;
import java.util.List;

import dao.histoCarbDao;
import jakarta.jws.WebService;
import metier.Carburant;
import metier.Station;
import metier.StationCarburant;


@WebService(endpointInterface = "ws.histoCarbWs")
public class histoCarbWsImpl implements histoCarbWs{

	@Override
	public void ajouterHistoCarb(Station station, Carburant carburant, float prix, Date date) {
		histoCarbDao h=new histoCarbDao();
		
		h.ajouterHistoCarb(station, carburant, prix, date);
		
	}

	@Override
	public List<StationCarburant> listHistoCarb() {
		histoCarbDao h=new histoCarbDao();
		return h.getAllStationCarburant();
	}

}
