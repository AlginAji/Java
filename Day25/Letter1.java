package Day25;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Letter1 {
	Letter l=new Letter();
	String e="AJIALGIN";
	@Before
	public void TestCase( ) {
		System.out.println("Compare the Letter Same");
	}
	@Test	
	public void FirstTest() {
		String lh=l.getHigh("Algin","Ajlin","AjiAlgin");
		assertEquals(lh,e);
		System.out.println("Same");
	}
	@After
	public void Check() {
		System.out.println("Correct");
	}

}
