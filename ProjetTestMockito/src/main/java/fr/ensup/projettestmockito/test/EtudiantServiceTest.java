package fr.ensup.projettestmockito.test;

import org.hamcrest.core.IsNull;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

import java.sql.SQLException;
import java.util.List;

import fr.ensup.projettestmockito.dao.EtudiantDao;
import fr.ensup.projettestmockito.domaine.Etudiant;
import fr.ensup.projettestmockito.service.EtudiantService;
import static org.junit.Assert.*;


public class EtudiantServiceTest {
	
	Etudiant etudiant;
	Etudiant etudiant2;
	@Before
	public void setUp() {
	etudiant = new Etudiant();
	etudiant2 = new Etudiant(1, "", "","","","","");
	}
	
	@Test
	public void testAjouterEtudiant() throws SQLException  {
	        // creation du mock
	        EtudiantDao test = mock(EtudiantDao.class);

	        // pattern comportemental
	        when(test.creerEtudiant(etudiant)).thenReturn(true);

	        // assertion
	        assertEquals(test.creerEtudiant(etudiant), true);
	}
	
	@Test
	public void testSupprimerEtudiant(){
	        // creation du mock
	        EtudiantDao test = mock(EtudiantDao.class);

	        // pattern comportemental
	        when(test.supprimerEtudiant(1)).thenReturn(true);

	        // assertion
	        assertEquals(test.supprimerEtudiant(1), true);
	}

}
