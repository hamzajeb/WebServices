package ws;
import java.util.Date;
import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;
import metier.Carburant;
import metier.Station;


@WebService
@SOAPBinding(style =Style.DOCUMENT )
public interface StationWs {
	@WebMethod
	public void ajouterStation(@WebParam(name="nom") String nom,@WebParam(name="adresse") String adresse,@WebParam(name="ville") String ville) ;
	
	@WebMethod
	public List<Station> listStations() ;
	
	
	@WebMethod
	public void ajouterCarb(@WebParam(name="idStation") int id1,@WebParam(name="idCarburant") int id2,@WebParam(name="prix") float prix,@WebParam(name="date") Date date) ;
}
