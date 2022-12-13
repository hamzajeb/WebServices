package com.fstt.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientRest {
public static void main(String[] args) {
	try {

		Client client = Client.create();
		
		
		//ajouter carburant
		WebResource webResource2 = client
				   .resource("http://localhost:8080/TPJRS2/carburant/carburant/SP95-E10/carburant");
		ClientResponse response2 = webResource2.accept("application/json")
                .get(ClientResponse.class);
		
		//liste des carburants
		WebResource webResource = client
		   .resource("http://localhost:8080/TPJRS2/carburant/carburants");

		ClientResponse response = webResource.accept("application/json")
                   .get(ClientResponse.class);

		if (response.getStatus() != 200) {
		   throw new RuntimeException("Failed : HTTP error code : "
			+ response.getStatus());
		}

		String output = response.getEntity(String.class);

		System.out.println("list of carburants .... \n");
		System.out.println(output);
		
		
		//ajouter station
		WebResource webResource3 = client
				   .resource("http://localhost:8080/TPJRS2/station/station/station16/msala/tanger");
		ClientResponse response3 = webResource3.accept("application/json")
                .get(ClientResponse.class);
		
		//liste des stations
		WebResource webResource4 = client
		   .resource("http://localhost:8080/TPJRS2/station/stations");

		ClientResponse response4 = webResource4.accept("application/json")
                   .get(ClientResponse.class);

		if (response4.getStatus() != 200) {
		   throw new RuntimeException("Failed : HTTP error code : "
			+ response.getStatus());
		}

		String output2 = response4.getEntity(String.class);
		System.out.println("\n");
		System.out.println("list of stations .... \n");
		System.out.println(output2);

	  } catch (Exception e) {

		e.printStackTrace();

	  }
}
}
