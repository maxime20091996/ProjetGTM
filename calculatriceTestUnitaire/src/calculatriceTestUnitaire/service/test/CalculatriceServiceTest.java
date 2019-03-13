package calculatriceTestUnitaire.service.test;

import static org.junit.Assert.assertEquals; 
import static org.junit.Assert.fail;

import org.junit.Test;	

public class CalculatriceServiceTest {
	
	CalculerService calc = new CalculerService();
	
	@Test
	public void TestAdditionEntier() {
		assertEquals(8, calc.addition(3,5));
	}
	
	@Test
	public void TestSoustractionEntier() {
		assertEquals(3, calc.soustraction(8,5));
	}
	
	@Test
	public void TestMultiplicationEntier() {
		assertEquals(15, calc.multiplication(3,5));
	}
	
	@Test
	public void TestDivisionEntier() {
		assertEquals(2, calc.division(10,5));
	}
}
