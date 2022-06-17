package citius.tra.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import citius.tra.entity.CustomerRegistration;
import citius.tra.entity.Movies;
import citius.tra.entity.RentalRecords;

public class BlockBusterDao {

protected static EntityManagerFactory entityManagerFactory;
	
	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("hibernateAssignment");
		Runtime.getRuntime().addShutdownHook(new Thread(() -> entityManagerFactory.close()));
	}
	
	public void addStocks(Movies mov) {
		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			
			entityManager.persist(mov); 
			
			//entityManager.flush();
			tx.commit();
			
		}
		finally {
			entityManager.close();
		}
	}
	
	public void updateStocks(Movies mov) {
		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			
			entityManager.merge(mov);
			
			tx.commit();
			
		}
		finally {
			entityManager.close();
		}
	}
	
	public void addCustomer(CustomerRegistration cust) {
		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			
			entityManager.persist(cust); 
			
			tx.commit();
			
		}
		finally {
			entityManager.close();
		}
	}
	
	public void rentMovie(RentalRecords rent) {
		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			
			entityManager.persist(rent); 
			
			tx.commit();
			
		}
		finally {
			entityManager.close();
		}
	}
}
