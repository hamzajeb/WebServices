package metier;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.CarburantDao;
import dao.StationDao;
import dao.histoCarbDao;




public class createSchema {
	public static void main(String[] args) {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("unit");
				EntityManager em = emf.createEntityManager();
				em.getTransaction().begin();

			    

	}
}
