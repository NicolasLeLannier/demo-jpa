package fr.diginamic.bibliotheque.essaie;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.diginamic.bibliotheque.entite.Client;
import fr.diginamic.bibliotheque.entite.Emprunt;
import fr.diginamic.bibliotheque.entite.Livre;
import fr.diginamic.entite.Region;

public class TestLivre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		Livre livre = em.find(Livre.class, 3);
		if(livre != null) {
			System.out.println(livre.getTitre());
		}

		
		Emprunt emprunt = em.find(Emprunt.class, 2);
		if(emprunt != null) {
			System.out.println(emprunt.getLivres());
		}
		
		Client client = em.find(Client.class, 3);
		if(client != null) {
			System.out.println(client.getEmprunt());
		}
		
		TypedQuery<Livre> q1 = em.createQuery("SELECT l FROM Livre l JOIN l.emprunts e WHERE e.id=:param1", Livre.class);
		q1.setParameter("param1", 2);
		List<Livre> listeLivres = q1.getResultList();
		
		for(Livre livre1 : listeLivres) {
			System.out.println(livre1);
		}
		
		transaction.commit();
	}

}
