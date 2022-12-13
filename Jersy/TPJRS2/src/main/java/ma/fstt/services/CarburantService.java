package ma.fstt.services;

import java.util.List;

import dao.CarburantDao;
import metier.Carburant;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/carburant")
public class CarburantService {
	@GET
	@Path("/carburant/{nom}/{description}")
	@Produces(MediaType.APPLICATION_JSON)
	public void ajouterCarburant(@PathParam(value="nom") String nom,@PathParam(value="description") String description) {
		CarburantDao carburantDao=new CarburantDao();
		carburantDao.ajouterCarburant(nom, description);
		
	}
	@SuppressWarnings("unchecked")
	@GET
	@Path("/carburants")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Carburant> listCarburants() {
		// TODO Auto-generated method stub
		CarburantDao carburantDao=new CarburantDao();
		return carburantDao.getAllCarburants();
	}
}
