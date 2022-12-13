package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import metier.Carburant;
import metier.Station;
import metier.StationCarburant;

public class histoCarbDao {
	private static final String PERSISTENCE_UNIT_NAME = "unit";	
	private static EntityManager entityMgrObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
	private static EntityTransaction transactionObj = entityMgrObj.getTransaction();
	
	
	
	// Method To Add Create School Details In The Database
		public void ajouterHistoCarb(Station station, Carburant carburant, float prix, Date date) {
			transactionObj.begin();
			
			StationCarburant histoCarb = new StationCarburant(station,carburant,prix,date);

			entityMgrObj.persist(histoCarb);
			transactionObj.commit();
				
		}
		
		
		
		
		@SuppressWarnings("unchecked")
		public static List getAllStationCarburant() {
			Query queryObj = entityMgrObj.createQuery("SELECT s FROM StationCarburant s");
			List<StationCarburant> lList = queryObj.getResultList();
			if (lList != null && lList.size() > 0) {			
				return lList;
			} else {
				return null;
			}
		}
	
}
