package projetexercicejunit.service.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import org.hamcrest.core.CombinableMatcher;
import org.junit.Test;

// indique quelle classe de test il faut inclure dans la suite et dans quel ordre
@RunWith(Suite.class)
@Suite.SuiteClasses({
	AssertionTest.class
})

public class AssertionTestSuite {

}
