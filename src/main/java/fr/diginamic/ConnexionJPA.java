package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.diginamic.entite.Region;

public class ConnexionJPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("recensement_jpa");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		Region r = em.find(Region.class, 1);
		System.out.println(r.getNom());
		
		Region r1 = new Region();
		r1.setNom("Ile de France");
		
		em.persist(r1);
		
		transaction.commit();
	}

}
