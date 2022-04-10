import java.util.Scanner;
public class Majedbawarshi_Q2 {
	public static int (char student,int StudentMark) {
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter your number of student:");
		int NumberOfStudents = input.nextInt();
		
		while(NumberOfStudents>=1) {
			
			for(x=1;x<NumberOfStudents;x++) {
				
				System.out.print("Enter the student name: ");
			    String student[x] = (String) input.next();
			    System.out.print("Enter the student grade: ");
			    double grade = input.nextDouble();
			}
			
			NumberOfStudents = NumberOfStudents-1;
		}
	}

}
