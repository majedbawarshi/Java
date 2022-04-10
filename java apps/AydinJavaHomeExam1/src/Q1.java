import java.util.Scanner;
public class Q1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter your number:");
		long num=input.nextLong();
		
		System.out.print("your number sumation "+sumDigits(num));
		
	}
	public static int sumDigits(long n) {
		int number=(int)n;
		int sum=0;
		while(number!=0) {
			sum=sum+(number%10);
			number=number/10;
		}
		return sum;
	}

}
