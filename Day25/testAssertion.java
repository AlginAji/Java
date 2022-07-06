package Day25;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testAssertion {
	
	
	String a="Abcd";
	String b="Efgh";
	String e="Abcd";
	String f=null;
	int c=8;
	int d=10;
	
	@Before
	public void TextCase() {
		System.out.println("Same");
	}
	@Test
	public void FirstText() {
		assertEquals(a,e);
	}
	@Test
	public void SecondText() {
		assertNotEquals(a,b);
	}
	@Test
	public void ThirdText() {
		assertNull(f);
	}
	@Test
	public void FourthTest() {
		assertNotNull(b);
	}
	@Test
	public void Fifthtest() {
		assertTrue(c<d);
	}
	@Test
	public void SixthTest() {
		assertFalse(c>d);
	}
	@Test
	public void SeventhTest() {
		assertSame(a,e);
	}
	@Test
	public void Eighttest() {
		assertNotSame(a,b);
	}
	@After
	public void AfterTest() {
		System.out.println("SuccessFully");
	}


}
