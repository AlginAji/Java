package Day25;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Check {
	@Before
	public void Checked() {
		System.out.println("Checking Number");
	}
	Checking ch=new Checking();
	@Test
	public void FirstTest() {
		ch.High();
	}
	@Test
	public void SecondTest() {
		ch.Low();
	}
	@Test
	public void ThirdTest() {
		ch.Equal();
	}
	@Test
	public void FourthTest() {
		ch.Same();
	}
	@After
	public void TestCase() {
		System.out.println("All Are Right");
	}
	

}
