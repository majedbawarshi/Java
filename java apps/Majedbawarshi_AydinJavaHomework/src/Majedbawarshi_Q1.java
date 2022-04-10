import java.util.Scanner;

public class Majedbawarshi_Q1 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the number of students: ");
	    int NumberOfStudents = input.nextInt();
	    System.out.print("Enter the student name: ");
	    String student = input.next();
	    System.out.print("Enter the student grade: ");
	    double grade = input.nextDouble();
	    
	    
	    for (int i = 0; i < NumberOfStudents - 1 ; i++) {                
	      System.out.print("Enter the student name: ");
	      String student1 = input.next();
	      System.out.print("Enter the student grade: ");
	      double grade1 = input.nextDouble();
	      if (grade1 > grade) {   
	        student = student1;
	        grade = grade1;
	      }
	    }
	    System.out.println("Top student is " +student + " and " +student + "'s grade is " + grade);
	  }
}
