package rs;

import java.net.MalformedURLException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.Station;
import metier.Carburant;


public class ClientRs {
public static void main(String[] args) throws MalformedURLException {
	

    StationRsService s = new StationRsService();
   
    s.ajouterStation("Station A", "Derissia", "Tanger");
    s.ajouterStation("Station B", "Beni makada", "Tanger");
    s.ajouterStation("Station C", "Anfa", "Casablanca");
   
 
    List<Station> list = new ArrayList();
    
    list = s.listStations();
    System.out.println("Nos stations : ");
    for (int i=0; i<list.size();i++)
    {
        System.out.println(list.get(i).toString()+"\n");

    }
    
    CarburantRsService c = new CarburantRsService();
    
    c.ajouterCarburant("Carburant 1", "Essence");
    c.ajouterCarburant("Carburant 2", "Diesel");
    c.ajouterCarburant("Carburant 3", "Fuel");
    
    List<metier.Carburant> listCarb = new ArrayList();
    
    listCarb = c.listCarburants();
    System.out.println("Nos carburants : ");
    for (int i=0; i<listCarb.size();i++)
    {
        System.out.println(listCarb.get(i).toString()+"\n");

    }
    
    HistoCarbRsService h = new HistoCarbRsService();
    Date date = new Date();  
    Station stat = new Station("Station D","Menara","marrakech");
    Carburant carb = new Carburant("Carburant 4","Essence");
    h.ajouterHistoCarb(stat, carb, 1000, date);
    
    
 List liste = new ArrayList();
    
    liste = h.listHistoCarb();
    System.out.println("Nos HistoCarb : ");
    for (int i=0; i<liste.size();i++)
    {
        System.out.println(liste.get(i).toString()+"\n");

    }
  
    
    
    
    
    
    
 
	

}
}
