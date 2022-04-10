package quiz;
import java.util.Scanner;
public class ab {
	public static double footToMeter(double foot) 
	{
		double meter ;
		meter = 0.305 * foot ;
		return meter;
	}
	public static double meterToFoot(double meter) 
	{
		double foot;
		foot = 3.279 * meter ;
		return foot;
	}
	public static void main(String[] args) {
		System.out.println("Feet\tMeters\t|\tMeters\tFeet");
		System.out.println("________________________________________");
		for(double x=1,y=20;x<=10;x++) {
			System.out.print(x+"\t");
			System.out.print(footToMeter(x)+"\t|\t");
			System.out.print(y+"\t");
			System.out.print(meterToFoot(y)+"\n");
			y = y + 5;
		}
	}

}
