package Day25;

public class Letter {
		
	public String getHigh(String a,String b,String c) {
		if(a.length()>b.length()&&a.length()>c.length()) {
			return a.toUpperCase();
		}
		else if(b.length()>a.length()&&b.length()>c.length()) {
			return b.toUpperCase();
		}
		else {
			return c.toUpperCase();
		}
			
	}

}
