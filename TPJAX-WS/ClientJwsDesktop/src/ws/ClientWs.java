package ws;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.List;

import javax.xml.namespace.QName;

import jakarta.xml.ws.Service;



public class ClientWs {
public static void main(String[] args) throws MalformedURLException {
	URL url = new URL("http://localhost:8086/wsStation?wsdl");
	
    QName qname = new QName("http://ws/","StationWsImplService");

    Service service = Service.create(url, qname);

    StationWs s1 = service.getPort(StationWs.class);
   
    s1.ajouterStation("station2", "Msala", "tanger");
    
	URL url2 = new URL("http://localhost:8086/wsCarburant?wsdl");

    QName qname2 = new QName("http://ws/","CarburantWsImplService");

    Service service2 = Service.create(url2, qname2);

    CarburantWs s2 = service2.getPort(CarburantWs.class);
    s2.ajouterCarburant("SP95", " ce carburant contient 10 % d'éthanol.");
    
	URL url3 = new URL("http://localhost:8086/wsHistoCarb?wsdl");
	

    QName qname3 = new QName("http://ws/","histoCarbWsImplService");

    Service service3 = Service.create(url3, qname3);

    histoCarbWs s3 = service3.getPort(histoCarbWs.class);
    Date date = new Date();  
    s3.ajouterHistoCarb(new Station("station3", "Msala", "tanger"), new Carburant("SP96", " ce carburant contient 60 % d'éthanol."), 1000, date);
    List<Station> list= s1.listStations();
}
}
