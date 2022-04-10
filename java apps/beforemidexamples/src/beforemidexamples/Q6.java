package beforemidexamples;

public class Q6 {

	public static void main(String[] args) {
		int w=85;
		System.out.println("The smallest number that divides number 85:");
		for(int x=1;x<=100;x++) {
			
			if(w%x==0) {
				System.out.println("  "+x);
				break;
			}
		}
	}

}
