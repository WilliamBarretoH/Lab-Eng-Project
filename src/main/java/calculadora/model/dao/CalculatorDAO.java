package calculadora.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import calculadora.config.JPAFactory;
import calculadora.model.entity.Calculator;

public class CalculatorDAO {

	public void createCalculator(Calculator calculator) {
		
		EntityManager entityManager = JPAFactory.getEntityManager();

		entityManager.getTransaction().begin();
		entityManager.persist(calculator);
		entityManager.getTransaction().commit();
		entityManager.close();		
	}
	
	public Calculator find(final Integer id) {
        EntityManager entityManager = JPAFactory.getEntityManager();
        return entityManager.find(Calculator.class, id);
	}
}
