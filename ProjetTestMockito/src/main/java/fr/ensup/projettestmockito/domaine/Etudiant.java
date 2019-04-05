package fr.ensup.projettestmockito.domaine;

/**
 * Etudiant est la classe représentant les étudiants de l'école ENSUP
 * 
 * @author maxime
 */

public class Etudiant {
	
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private String adresse;
	private String telephone;
	private String datenaissance;
	
	public Etudiant(int id, String nom, String prenom, String email, String adresse, String telephone, String datenaissance) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.telephone = telephone;
		this.datenaissance = datenaissance;
	}

	public Etudiant() {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.telephone = telephone;
		this.datenaissance = datenaissance;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getDatenaissance() {
		return datenaissance;
	}

	public void setDatenaissance(String datenaissance) {
		this.datenaissance = datenaissance;
	}

	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", adresse="
				+ adresse + ", telephone=" + telephone + ", datenaissance=" + datenaissance + "]";
	}
	
	
}
