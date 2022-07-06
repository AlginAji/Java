package Day25;

public class Checking {
	int a=10;
	public void High() {
		if(a>=0) {
			System.out.println("Positve");
		}
	}
		public void Low() {
		 if(a<0) {
			System.out.println("negative");
		}
		 else {
			 System.out.println("Wrong");
		 }
	}
		 public void Equal() {
		 if(a==0) {
			System.out.println("Neutral Number");
		}
	}
		 public void Same() {
			 boolean b=true;
			 for(int i=2;i<a;i++) {
				 if(a%i==0) {
					 b=false;
				 }
			 }
				if(b) {
					System.out.println("Prime Number");
				}
				else {
					System.out.println("Not Prime Number");
				}
			 
		 }

}
