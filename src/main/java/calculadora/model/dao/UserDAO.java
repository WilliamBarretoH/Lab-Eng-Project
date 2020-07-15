package calculadora.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import calculadora.config.JPAFactory;
import calculadora.model.entity.User;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserDAO {
	
	
	public void createUser(User user) {
		
		
		EntityManager entityManager = JPAFactory.getEntityManager();
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(user);
		
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public List<User> listAll() {
		
		EntityManager entityManager = JPAFactory.getEntityManager();
	
		List<User> listUser = null;
		
		Query query = entityManager.createQuery("SELECT u FROM User u");
		
		listUser = query.getResultList();
		
		entityManager.close();
		return listUser;
	}
	
	public boolean validate(final String email, final String password) {
        User usuario = null;
        EntityManager entityManager = JPAFactory.getEntityManager();
        Query query = entityManager.createQuery("FROM " + User.class.getName() + " U WHERE U.email = :email").setParameter("email", email);
        
        usuario = (User) query.getResultList().get(0);
        
        if (usuario != null && usuario.getPassword().equals(password)) {
            return true;
        }
        
        return false;
    }
	
	public User findByEmail(final String email) {
        User user = null;
        EntityManager entityManager = JPAFactory.getEntityManager();

        Query query = entityManager.createQuery("FROM " + User.class.getName()+ " U WHERE U.email = :email").setParameter("email", email);
        
        user = (User) query.getResultList().get(0);
        
        return user;
    }

}
