package beforemidexamples;
import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the weight in pounds: ");
		int weight =input.nextInt();
		System.out.print("Enter height in inches: ");
		int height =input.nextInt();
		
		if(weight>50 ^ height>60) {
			System.out.print("true.");
		}
		else {
			System.out.print("false!");
		}
	}

}
