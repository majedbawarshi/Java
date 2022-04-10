import java.util.Scanner;
public class Q2 {

	public static void reverse (int number) {
		System.out.print("your reversed number is:");
		while(number>0) {
			System.out.print(""+number%10);
			number=number/10;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter your number:");
		int num=input.nextInt();
		reverse(num);
	}
		
	}


