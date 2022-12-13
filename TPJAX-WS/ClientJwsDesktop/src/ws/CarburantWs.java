package ws;

import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style =Style.DOCUMENT )
public interface CarburantWs {
	@WebMethod
	public void ajouterCarburant(@WebParam(name="nom") String nom,@WebParam(name="description") String description) ;

	@WebMethod
	public List<Carburant> listCarburants() ;
}
