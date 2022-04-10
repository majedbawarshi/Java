import java.util.Scanner;
public class Q3 {
	/**print the card type **/
	public static void printCardType(int firstNumber) {
		if(firstNumber==4) {
			System.out.print("the type of credit card is visa card.");
		}
		else if(firstNumber==5){
			System.out.print("the type of credit card is master cards.");
		}
		else if(firstNumber==6){
			System.out.print("the type of credit card is discover card.");
		}
		else {
			System.out.print("the card is not valid!");
		}
	}
	
	/** return the first number of the card **/
  	public static int returnFirstNumber(long number) {
  		int num = (int) number;
  		int y=getSize(num);
  		
  		for(int x=1;x<y;x++) {
  			num/=10;
  		}
  		return num;
  	} 

  	/** Return the number of digits in d */
	 public static int getSize(long d) {
		int creditNum=(int)d;
		int a=0;
		while(creditNum!=0) {
			creditNum/=10;
			a++;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		System.out.print("enter your credit number:");
		int creditNum =input.nextInt();
		System.out.print(""+returnFirstNumber(creditNum));
		
		
		
		
	}

}
