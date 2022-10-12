package MortageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is the loan amount?  ");
		int principal = scanner.nextInt();
		System.out.print("What is the annual interest rate?  ");
		float monthlyInterest = scanner.nextFloat()/(100 * 12);
		System.out.print("How long (in years) is the mortgage?  ");
		int termInMonths = scanner.nextInt() * 12;

		double mortgagePayment = principal * ((monthlyInterest * Math.pow(1 + monthlyInterest, termInMonths))/(Math.pow(1 + monthlyInterest, termInMonths)-1));
		NumberFormat currency =  NumberFormat.getCurrencyInstance();
		String mortgagePaymentFormatted = currency.format(mortgagePayment);
		System.out.print("Your monthly payment will be " + mortgagePaymentFormatted);
		scanner.close();
	}

}
