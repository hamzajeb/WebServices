package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import metier.Carburant;
import metier.Station;
import metier.StationCarburant;

public class CarburantDao {
	private static final String PERSISTENCE_UNIT_NAME = "unit";	
	private static EntityManager entityMgrObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
	private static EntityTransaction transactionObj = entityMgrObj.getTransaction();
	
	
	
	// Method To Add Create School Details In The Database
		public void ajouterCarburant(String nom, String description) {
				transactionObj.begin();
			Carburant carburant = new Carburant(nom , description);
			
			entityMgrObj.persist(carburant);
			
			transactionObj.commit();
				
		}
		
		public Carburant getById(int id) {
			Carburant c = new Carburant();
			c = entityMgrObj.find(Carburant.class, id);
			// JPAUtil.shutdown();
			return c;
		}
		
		
		@SuppressWarnings("unchecked")
		public static List<Carburant> getAllCarburants() {
			Query queryObj = entityMgrObj.createQuery("SELECT c FROM Carburant c");
			List<Carburant> lList = queryObj.getResultList();
			if (lList != null && lList.size() > 0) {			
				return lList;
			} else {
				return null;
			}
		}
	
}
