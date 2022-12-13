package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import metier.Carburant;
import metier.Station;

public class StationDao {
	private static final String PERSISTENCE_UNIT_NAME = "unit";	
	private static EntityManager entityMgrObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
	private static EntityTransaction transactionObj = entityMgrObj.getTransaction();
	
	
	
	// Method To Add Create School Details In The Database
		public void ajouterStation(String nom, String adresse, String ville) {
				transactionObj.begin();

			Station station = new Station(nom , adresse,ville);
			
			entityMgrObj.persist(station);
			transactionObj.commit();
				
		}
		
		public Station getById(int id) {
			Station c = new Station();
			c = entityMgrObj.find(Station.class, id);
			// JPAUtil.shutdown();
			return c;
		}
		
		
		@SuppressWarnings("unchecked")
		public static List getAllStations() {
			Query queryObj = entityMgrObj.createQuery("SELECT s FROM Station s");
			List<Station> lList = queryObj.getResultList();
			if (lList != null && lList.size() > 0) {			
				return lList;
			} else {
				return null;
			}
		}
	
	
	
}
