package calculadora.model.dao;

import javax.persistence.EntityManager;

import calculadora.config.JPAFactory;
import calculadora.model.entity.History;

public class HistoryDAO {
	
	public void createHistory(History history) {
		
		EntityManager entityManager = JPAFactory.getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(history);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}

}
