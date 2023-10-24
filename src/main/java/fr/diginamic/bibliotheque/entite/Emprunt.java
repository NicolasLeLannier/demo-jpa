package fr.diginamic.bibliotheque.entite;

import java.sql.Date;
import java.time.LocalDate;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Emprunt")
public class Emprunt {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
//	@Temporal(TemporalType.DATE)
	@Column(name="date_debut")
	private LocalDate dateDebut;
	
	@Column(name="delai", length = 10)
	private int delai;
	
//	@Temporal(TemporalType.DATE)
	@Column(name="date_Fin")
	private LocalDate dateFin;
	
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client client;
	
	@ManyToMany
	@JoinTable(name = "COMPO",joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"), 
								inverseJoinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"))
	private List<Livre> livres;

	/** Constructor
	 * 
	 */
	public Emprunt() {
		super();
	}

	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", dateDebut=" + dateDebut + ", delai=" + delai + ", dateFin=" + dateFin + "]";
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
	 * @return the dateDebut
	 */
	public LocalDate getDateDebut() {
		return dateDebut;
	}

	/** Setter
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	/** Getter
	 * @return the delai
	 */
	public int getDelai() {
		return delai;
	}

	/** Setter
	 * @param delai the delai to set
	 */
	public void setDelai(int delai) {
		this.delai = delai;
	}

	/** Getter
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/** Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	/** Getter
	 * @return the livres
	 */
	public List<Livre> getLivres() {
		return livres;
	}

	/** Setter
	 * @param livres the livres to set
	 */
	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

	/** Getter
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/** Setter
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	
	
}
