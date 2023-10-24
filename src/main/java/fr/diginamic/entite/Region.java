package fr.diginamic.entite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="REGION")
public class Region {

	// @Id => Clé primaire, @GeneratedValue => Auto Increment
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(length = 150, nullable = false)
	String nom;
	
	// ------------------------------ Jour, mois, année  (@Temporal => pas besoin pour LocalDateTime)
//	@Temporal(TemporalType.DATE)
//	@Column(name="date_naissance")
//	private Date dateNaissance;
//	private LocalDate dateNaissance;
	
	// ------------------------------ Avec les enum, ici Civilite est un fichier enum
//	@Enumerated(EnumType.STRING)
//	@Column(length = 10)
//	private Civilite civilite;
	
//	@OneToMany(mappedBy = "client")
//	private List<Personne> comptes = new ArrayList<>();
	
	/** Constructor
	 * @param id
	 * @param nom
	 */
	public Region() {
	}

	@Override
	public String toString() {
		return "Region [id=" + id + ", nom=" + nom + "]";
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
