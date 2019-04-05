package fr.ensup.projettestmockito.service;

import java.sql.SQLException; 
import java.sql.Statement;
import java.util.ArrayList;

import fr.ensup.projettestmockito.dao.ConnexionDao;
import fr.ensup.projettestmockito.dao.EtudiantDao;
import fr.ensup.projettestmockito.domaine.Etudiant;

public class EtudiantService {
	
	EtudiantDao etudiantdao = new EtudiantDao();
	
	/**
     * Retourne la liste des étudiants.
     * 
     * @return Une arrayList de etudiant, qui correspond à la liste des étudiants de l'école ENSUP.
     */
	
	public ArrayList<Etudiant> etudiant(ConnexionDao conn) {
		
		ArrayList<Etudiant> listerEtudiant = new ArrayList<Etudiant>();
			ConnexionDao cd = new ConnexionDao();
			Statement st = cd.getConnection();
			EtudiantDao etudiantdao =  new EtudiantDao();
			
			listerEtudiant = etudiantdao.listerEtudiant();
			
			return listerEtudiant;
	}
	
	public boolean ajouterEtudiant(Etudiant etudiant) throws SQLException {
		
		etudiantdao.creerEtudiant(etudiant);
		return false;
	}
	
	public void supprimerEtudiant() {
		
		EtudiantDao etudiantdao = new EtudiantDao();
		
		etudiantdao.supprimerEtudiant(0);
	}

	public void modifierEtudiant() {
		
		EtudiantDao etudiantdao = new EtudiantDao();
		
		etudiantdao.modifierEtudiant();
	}
}

