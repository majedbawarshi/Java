import java.util.Scanner;
public class Q1 {
	public static int sumDigits (long n) {
		int temp = (int)n;
		int sum=0;
		while(temp!=0) {
			sum+=(temp%10);
			temp/=10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter your number that u want to sum:");
		long num=input.nextLong();
		System.out.println("your number sumation is:"+sumDigits(num));
		
	}

}
