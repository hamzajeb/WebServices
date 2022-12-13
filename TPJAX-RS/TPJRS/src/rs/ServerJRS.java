package rs;

import jakarta.xml.ws.Endpoint;

public class ServerJRS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String url1="http://localhost:8080/carburant";
		Endpoint.publish(url1,new StationRsService() );
		System.out.println("Web Service pour station deploye sur "+url1);
		String url2="http://localhost:8080/carburant";
		Endpoint.publish(url2,new CarburantRsService() );
		System.out.println("Web Service pour carburant deploye sur "+url2);
		String url3="http://localhost:8080/histoCarburant";
		Endpoint.publish(url3,new HistoCarbRsService() );
		System.out.println("Web Service pour carburant deploye sur "+url3);

	}

}
