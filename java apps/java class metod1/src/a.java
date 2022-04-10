import java.util.Scanner;
public class a {
	
	public static double celtofah(double cel) {
		double fah;
		fah=(9.0/5)*cel+32;
		return far;
	}
	public static double fahtocel(double fah) {
		double cel;
		cel =(5.0/9)*(fah-32);
		return cel;
	}
	
	public static void main(String[] args) {
		double celcal,fahcal,celinput,fahinput ;
		Scanner.input =new Scanner (System.in);
		
		System.out.println("please provide cel degrees to convert:");
		celinput.input.nextDouble();
		
		fahcal=celtofah(cel);
		System.out.println();
		System.out.println("entered celicus "+cel+"is equal to "+fah);
		System.out.println("please provide fah degree to convert ");
		fahinput=input.nextDouble();
		
	}

}
