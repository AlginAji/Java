package Day25;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Prac {
	@Before
	public void firstTest() {
	System.out.println("Welcome to Junit");
	}
	@Test
	public void testCase() {
		System.out.println("This is Our First test");
	}
	@After
	public void afterCase() {
		System.out.println("Thank You");
	}	
}
