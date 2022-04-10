import java.util.Scanner;
public class Majedbawarshi_Q2 {
	public static double futureInvestmentValue(double investmentAmount,double monthlyInterestRate,int years) {
		
		double invest=investmentAmount ;
		
			for(int y=1;y<=years;y++) {
				for(int z=1;z<=12;z++) {
					invest=invest+(invest*monthlyInterestRate);
			}
				System.out.println(y+"\t "+invest);
		}
		
		return invest;
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("The amount invested:");
		double investmentAmount =input.nextDouble();
		System.out.print("Annual interest rate:");
		double Annualinterestrate =input.nextDouble();
		Annualinterestrate=(Annualinterestrate/100)/12;
		System.out.println("Years\t Future Value");
		
		double output=futureInvestmentValue(investmentAmount,Annualinterestrate,30);
		
	}

}
