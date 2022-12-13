package ws;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url1="http://localhost:8086/wsStation";
		Endpoint.publish(url1,new StationWsImpl() );
		System.out.println("Web Service pour station deploye sur "+url1);
		String url2="http://localhost:8086/wsCarburant";
		Endpoint.publish(url2,new CarburantWsImpl() );
		System.out.println("Web Service pour carburant deploye sur "+url2);
		String url3="http://localhost:8086/wsHistoCarb";
		Endpoint.publish(url3,new histoCarbWsImpl() );
		System.out.println("Web Service pour carburant deploye sur "+url3);

	}

}
