package projetexercicejunit.service.test;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.hamcrest.core.CombinableMatcher;
import org.junit.Test;


public class AssertionTest {
	
	@Test
	// Asserts de 2 Arrays identiques
	  public void testAssertArrayEquals() {
	    byte[] expected = "trial".getBytes();
	    byte[] actual = "trial".getBytes();
	    assertArrayEquals(expected, actual);
	  }
	
	@Test
	// Asserts de 2 objets égaux.
	  public void testAssertEquals() {
	    assertEquals("text", "text");
	  }

	  @Test
	  // Asserts avec une condition fausse.
	  public void testAssertFalse() {
	    assertFalse("failure - strings are not equal", false);
	  }

	  @Test
	  // Asserts d'un objet qui n'est pas nul.
	  public void testAssertNotNull() {
	    assertNotNull("should not be null", new Object());
	  }

	  @Test
	  // Asserts que deux objets qui se sont pas identiques.
	  public void testAssertNotSame() {
	    assertNotSame("should not be same Object", new Object(), new Object());
	  }

	  @Test
	  //  Asserts avec un objet qui est nul.
	  public void testAssertNull() {
	    assertNull("should be null", null);
	  }

	  @Test
	  // Asserts avec deux objets qui sont identiques.
	  public void testAssertSame() {
	    Integer aNumber = Integer.valueOf(768);
	    assertSame("should be same", aNumber, aNumber);
	  }

	  // JUnit Matchers assertThat
	  @Test
	  // assertThat(String reason, T actual, Matcher<? super T> matcher) 
	  public void testAssertThatBothContainsString() {
	    assertThat("albumen", both(containsString("a")).and(containsString("b")));
	  }

	  @Test
	  // AssertThat avec une liste et 2 items, il faut que les 2 items soient dans la liste
	  public void testAssertThatHasItems() {
	    assertThat(Arrays.asList("one", "two", "three"), hasItems("one", "three"));
	  }

	  @Test
	  // AssertThat que chaque item contient le string testé
	  public void testAssertThatEveryItemContainsString() {
	    assertThat(Arrays.asList(new String[] { "fun", "ban", "net" }), everyItem(containsString("n")));
	  }

	  // Core Hamcrest Matchers with assertThat
	  @Test
	  // Assert
	  public void testAssertThatHamcrestCoreMatchers() {
	    assertThat("good", allOf(equalTo("good"), startsWith("good")));
	    assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))));
	    assertThat("good", anyOf(equalTo("bad"), equalTo("good")));
	    assertThat(7, not(CombinableMatcher.<Integer> either(equalTo(3)).or(equalTo(4))));
	    assertThat(new Object(), not(sameInstance(new Object())));
	  }

	  @Test
	  public void testAssertTrue() {
	    assertTrue("failure - should be true", true);
	  }
	
}
