package financecalculator;

import java.util.Scanner;
public class FinanceCalculatorApp {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double principal=s.nextDouble();
		double rate=s.nextDouble();
		double time=s.nextDouble();
		FinanceCalculator f=new FinanceCalculator();
		System.out.printf("%.2f \n",f.calculateSimpleInterest(principal,rate,time));
		
	}

}
