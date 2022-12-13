package rs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import dao.CarburantDao;
import metier.Carburant;


@Path("/carburant")
public class CarburantRsService{

	@Path("/insertionCarburant")
	 @POST
	 
	public void ajouterCarburant(String nom, String description) {
		CarburantDao carburantDao=new CarburantDao();
		carburantDao.ajouterCarburant(nom, description);
		
	}

	@Path("/listeCarburants")
	@GET
	public List<Carburant> listCarburants() {
		// TODO Auto-generated method stub
		CarburantDao carburantDao=new CarburantDao();
		
		return carburantDao.getAllCarburants();
	}

}
