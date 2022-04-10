package example;
import java.util.Scanner;
public class New{
	public static void main (String[] args) {
		char s = '*';
		for(int i = 5;i>=1;i--) {//first loop
			for(int j = i;j>=1;j--) {//2nd loop
				System.out.print(" ");
			}
			for(int k = 5;k>=i;k--) {//3ed loop
				System.out.print(s + " ");
			}
			
			System.out.println();
		}

	}
}