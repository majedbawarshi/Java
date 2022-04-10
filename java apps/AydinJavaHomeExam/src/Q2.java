import java.util.Scanner;
public class Q2 {
	public static void reverse (int number) {
		while(number>0) {
			System.out.print((number % 10));
			number /= 10;
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter a number to reverse it:");
		int num1 = input.nextInt();
		System.out.print("your reversed number is:");
		reverse(num1);

	}

}
