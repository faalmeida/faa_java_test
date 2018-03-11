package ca.faalmeida.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedFactorialTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Parameters
	public static Collection<Object[]> factorialData() {
		return Arrays.asList(new Object[][] { { 0, 1 }, { 1, 1 }, { 2, 2 }, { 3, 6 }, { 4, 24 }, { 5, 120 }, { 6, 720 } });
	}

}
