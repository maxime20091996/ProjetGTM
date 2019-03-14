package etudiantdao.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import etudiantdao.dao.ConnexionDao;
import etudiantdao.metier.Etudiant;


public class EtudiantDaoTest {

	private Etudiant etudiant;
	private static Statement statement = null;
	
	 public static void setUpClass() {
		    System.out.println("@BeforeClass setUpClass");
		    ConnexionDao cd = new ConnexionDao();
			Statement st = cd.getConnection();
		  }
	
	@Test
	public void testlisterEtudiant() throws SQLException {
		ArrayList<Etudiant>listerEtudiant = new ArrayList();
			ConnexionDao cd = new ConnexionDao();
			Statement st = cd.getConnection();
			ResultSet rs = st.executeQuery("SELECT * FROM `etudiant` WHERE id = 1");
			while(rs.next()) {
				Etudiant etudiant = new Etudiant (0, null, null, null);
				etudiant.setNom(rs.getString("nom"));
				etudiant.setPrenom(rs.getString("prenom"));
				etudiant.setEmail(rs.getString("email"));
			
				listerEtudiant.add(etudiant);
			}
			
			assertEquals("jean", listerEtudiant.get(0).getNom());
			assertEquals("pierre", listerEtudiant.get(0).getPrenom());
			assertEquals("jp@email.com", listerEtudiant.get(0).getEmail());
	}
	
	@Test
	public void testmodifierEtudiant() throws SQLException {
			Etudiant etudiant = new Etudiant();
			ConnexionDao cd = new ConnexionDao();
			Statement st = cd.getConnection();
			st.executeUpdate("UPDATE `etudiant` SET `prenom` = 'Herve' WHERE id = 1");
			ResultSet rs = st.executeQuery("SELECT * FROM `etudiant` WHERE id = 1");
			while(rs.next()) {
				etudiant.setNom(rs.getString("nom"));
				etudiant.setPrenom(rs.getString("prenom"));
				etudiant.setEmail(rs.getString("email"));
			}
			//assertEquals("jean", etudiant.getNom());
			assertEquals("Herve", etudiant.getPrenom());
			//assertEquals("jp@email.com", etudiant.getEmail());
	}
	
	@Test
	public void testsupprimerEtudiant() throws SQLException {
			Etudiant etudiant = new Etudiant();
			ConnexionDao cd = new ConnexionDao();
			Statement st = cd.getConnection();
			st.executeUpdate("DELETE FROM `etudiant` WHERE id = 2");
			ResultSet rs = st.executeQuery("SELECT * FROM `etudiant` WHERE id= 2");
			while(rs.next()) {
				etudiant.setNom(rs.getString("nom"));
				etudiant.setPrenom(rs.getString("prenom"));
				etudiant.setEmail(rs.getString("email"));
			}
			assertNotEquals(etudiant.getId(), 2);	
	}
}
