package ws;

import java.util.List;

import dao.CarburantDao;
import dao.StationDao;
import jakarta.jws.WebService;
import metier.Carburant;

@WebService(endpointInterface = "ws.CarburantWs")
public class CarburantWsImpl implements CarburantWs{

	@Override
	public void ajouterCarburant(String nom, String description) {
		CarburantDao carburantDao=new CarburantDao();
		carburantDao.ajouterCarburant(nom, description);
		
	}

	@Override
	public List<Carburant> listCarburants() {
		// TODO Auto-generated method stub
		CarburantDao carburantDao=new CarburantDao();
		return carburantDao.getAllCarburants();
	}

}
