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
import metier.StationCarburant;

@WebService
@SOAPBinding(style =Style.DOCUMENT )
public interface histoCarbWs {
	@WebMethod
	public void ajouterHistoCarb(@WebParam(name="station") Station station,@WebParam(name="carburant") Carburant carburant,@WebParam(name="prix") float prix,@WebParam(name="date") Date date) ;

	@WebMethod
	public List<StationCarburant> listHistoCarb() ;
}
