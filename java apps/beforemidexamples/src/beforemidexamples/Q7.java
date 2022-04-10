package beforemidexamples;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter minutes: ");
		int min = input.nextInt();
		int year=min/525600;
		int day= (min%525600)/1440;
		
		System.out.print(""+min+" minutes is about "+year+" year and "+day+" day.");
	}

}
