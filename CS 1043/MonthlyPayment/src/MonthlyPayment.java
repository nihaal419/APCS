/* 
 * Name: Nihaal Manesia
 * Lab Section: L2
 * Lecture Section: 01
 * Date: 9-1-2016
 * Assignment: Calculating Monthly Payment
 * Description: Create a static method to calculate the monthly payment using the parameters.
*/
import java.text.NumberFormat;
import java.util.Scanner;

public class MonthlyPayment {
	public static double calculatePayment(int loanAmount, int termInYears, double interestRate){
		//convert interest rate
		interestRate = interestRate/100;
		
		//calculate monthtly rate
		double monthlyRate = interestRate / 12.0;
		
		int termInMonths = termInYears *12;
		
		double monthlyPayment = (double) (loanAmount*monthlyRate*(Math.pow((1.0+monthlyRate), termInMonths)))/((Math.pow((1.0+monthlyRate), termInMonths)-1));
		return monthlyPayment;
	}
	
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		NumberFormat interestFormat = NumberFormat.getPercentInstance();
		
		System.out.println("Enter loan amount: ");
		int loanAmount = scanner.nextInt();
		
		System.out.println("Enter loan term (In Years): ");
		int termInYears = scanner.nextInt();
		
		System.out.println("Enter interest rate: ");
		double interestRate = scanner.nextDouble();
		
		double monthlyPayment = calculatePayment(loanAmount,termInYears,interestRate);
		
		interestRate = interestRate/100;
		
		System.out.println("Loan Amount: "+currencyFormat.format(loanAmount));
		System.out.println("Loan Term: "+termInYears+" years");
		System.out.println("Interest Rate: "+interestFormat.format(interestRate));
		System.out.println("Monthly Payment: "+currencyFormat.format(monthlyPayment));
	}
}
