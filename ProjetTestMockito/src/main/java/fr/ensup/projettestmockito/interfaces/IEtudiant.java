package fr.ensup.projettestmockito.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import fr.ensup.projettestmockito.domaine.Etudiant;

public interface IEtudiant {
	
	public ArrayList<Etudiant>listerEtudiant();
	
	public void modifierEtudiant();
	
	public boolean supprimerEtudiant(int id);
	
	public boolean creerEtudiant(Etudiant etudiant) throws SQLException;

}
