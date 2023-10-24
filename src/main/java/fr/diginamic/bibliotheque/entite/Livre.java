package fr.diginamic.bibliotheque.entite;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Livre")
public class Livre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="titre", length = 255)
	private String titre;
	
	@Column(name="auteur", length = 50)
	private String auteur;
	
	@ManyToMany(mappedBy = "livres")
	private List<Emprunt> emprunts;

	/** Constructor
	 * 
	 */
	public Livre() {
		super();
	}

	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + "]";
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
	public String getTitre() {
		return titre;
	}

	/** Setter
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/** Getter
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/** Setter
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	/** Getter
	 * @return the emprunts
	 */
	public List<Emprunt> getEmprunts() {
		return emprunts;
	}

	/** Setter
	 * @param emprunts the emprunts to set
	 */
	public void setEmprunts(List<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}
}
