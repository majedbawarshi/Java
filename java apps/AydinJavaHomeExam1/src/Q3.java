import java.util.Scanner;
public class Q3 {
	public static int returnFirstNumber(long number) {
		int a=(int) number;
		int size=getSize(a);
		for(int i=1;i<size;i++) {
			a=a/10;
		}
		
		return a;
		
	}
	public static int getSize(long d) {
		int n=0;
		while(d!=0){
			d=d/10;
			n++;
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter ur credit card number:");
		long cardnum =input.nextLong();
		
		int numb1=returnFirstNumber(cardnum);
		System.out.print(""+numb1);
	}

}
