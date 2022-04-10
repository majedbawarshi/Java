import java.util.Scanner;
public class Majedbawarshi_Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] week = {"Monday","Tuseday", "Wednesday","Thursday","Friday","Saturday","Sunday"};
				
		System.out.println("Enter the year:(e.g., 2012):");
		int year = input.nextInt();
		
		System.out.println("Enter the month:1-12:");
		int month = input.nextInt();
		
		System.out.println("Enter the day of the month: 1-31:");
		int day = input.nextInt();
		
		if(month > 12){
			month = month%12;
			year = year-1;
		}
		
		int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int amountOfDays = (day + x + (31*m)/12);

        String dayname;
        if((amountOfDays%7) == 0) dayname = week[6];
        else dayname = week[(amountOfDays%7)-1];
		
		System.out.println("The name of the day is " + dayname);
		
	}
}
