package Day25;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Calcul {
	@Before
	public void firstText() {
	System.out.println("results");
	}
	Calculator ca=new Calculator();
		@Test	
	public void FirstTest() {
			ca.addition();
		}
		@Test
		public void SecondTest() {
			  ca.substraction();
		}
		@Test
		public void ThirdTest() {
			ca.division();}
		@Test
		public void FourthTest() {
			ca.multipication();
  		}
		@After
		public void afterCase() {
			System.out.println("Thank You");
		}
		}
