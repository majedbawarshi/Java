package beforemidexamples;

public class Q5 {

	public static void main(String[] args) {
		int w=85;
		System.out.println("the numbers that divide the number 85:");
		for(int x=1;x<=100;x++) {
			
			if(w%x==0) {
				System.out.println("  "+x);
			}
		}

	}

}
