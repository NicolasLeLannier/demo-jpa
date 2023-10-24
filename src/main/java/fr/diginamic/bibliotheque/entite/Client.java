package fr.diginamic.bibliotheque.entite;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nom", length = 50)
	private String nom;
	
	@Column(name="prenom", length = 50)
	private String prenom;
	
	
	@OneToMany(mappedBy = "client")
	private List<Emprunt> emprunt = new ArrayList<>();

	/** Constructor
	 * 
	 */
	public Client() {
		super();
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", titre=" + nom + ", auteur=" + prenom + "]";
	}

	/** Getter
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/** Setter
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/** Getter
	 * @return the titre
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param titre the titre to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the auteur
	 */
	public String getPrenom() {
		return prenom;
	}

	/** Setter
	 * @param auteur the auteur to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/** Getter
	 * @return the emprunt
	 */
	public List<Emprunt> getEmprunt() {
		return emprunt;
	}

	/** Setter
	 * @param emprunt the emprunt to set
	 */
	public void setEmprunt(List<Emprunt> emprunt) {
		this.emprunt = emprunt;
	}

	
	
}
