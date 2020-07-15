package calculadora.config;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAFactory {
    
private static EntityManagerFactory em;
	
	static {
		em = Persistence.createEntityManagerFactory("calculadora");
	}
	
	public static EntityManager getEntityManager() {
		return em.createEntityManager();
	}
}


