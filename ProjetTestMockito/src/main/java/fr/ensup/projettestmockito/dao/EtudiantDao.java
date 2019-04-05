package fr.ensup.projettestmockito.dao;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.ensup.projettestmockito.domaine.Etudiant;
import fr.ensup.projettestmockito.interfaces.IEtudiant;



public class EtudiantDao implements IEtudiant{

	/**
     * Retourne la liste des étudiants.
     * 
     * @return Une arrayList de etudiant, qui correspond à la liste des étudiants de l'école ENSUP.
     */
	
	public ArrayList<Etudiant> listerEtudiant() {
		// TODO Auto-generated method stub
		Connection conn;
		ArrayList<Etudiant>listerEtudiant = new ArrayList();
		try {
			ConnexionDao cd = new ConnexionDao();
			Statement st = cd.getConnection();
			ResultSet rs = st.executeQuery("SELECT * FROM etudiant");
			while(rs.next()) {
				Etudiant etudiant = new Etudiant (0, null, null, null, null, null, null);
				etudiant.setId(rs.getInt("id"));
				etudiant.setNom(rs.getString("nom"));
				etudiant.setPrenom(rs.getString("prenom"));
				etudiant.setEmail(rs.getString("email"));
				etudiant.setAdresse(rs.getString("adresse"));
				etudiant.setTelephone(rs.getString("telephone"));
				etudiant.setDatenaissance(rs.getString("datenaissance"));
			
				listerEtudiant.add(etudiant);
			}
		}catch (Exception e) {
				e.printStackTrace();
			}
			return listerEtudiant;
	}
	/**
     * Méthode qui permet de modifier les champs d'un etudiant en fonction de son identifiant
     */
	public void modifierEtudiant() {
		// TODO Auto-generated method stub
		try {
			ConnexionDao cd = new ConnexionDao();
			Statement st = cd.getConnection();
			st.executeUpdate("UPDATE `etudiant` SET `prenom` = 'Herve' WHERE id = 1");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	/**
     * Méthode qui permet de supprimer un étudiant en fonction de son identifiant
     */
	public boolean supprimerEtudiant(int id) {
		// TODO Auto-generated method stub
		try {
			ConnexionDao cd = new ConnexionDao();
			Statement st = cd.getConnection();
			st.executeUpdate("DELETE FROM `etudiant` WHERE id = 3");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return false;
		
	}
	
	/**
     * Méthode qui permet d'ajouter un étudiant à la liste des étudiants
     */

	public boolean creerEtudiant(Etudiant etudiant) throws SQLException {
		// TODO Auto-generated method stub
		try {
			ConnexionDao cd = new ConnexionDao();
			Statement st = cd.getConnection();
			st.executeUpdate("INSERT INTO `etudiant` (`nom`, `prenom`, `email`, `adresse`,`telephone`, `datenaissance`) VALUES ('" +etudiant.getNom()
			+ "', '" + etudiant.getPrenom() + "', '" + etudiant.getEmail() + "', '" + etudiant.getAdresse() + "', '" + etudiant.getTelephone() + "', '"
			+ etudiant.getDatenaissance() + "')");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return false;
		
	}

}

