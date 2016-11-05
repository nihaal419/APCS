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
	public static double calculatePayment(double initialLoan, int termInYears, double interestRate){
		//convert interest rate
		interestRate = interestRate/100;
		
		//calculate monthtly rate
		double monthlyRate = interestRate / 12.0;
		
		int termInMonths = termInYears *12;
		
		double monthlyPayment = (double) (initialLoan*monthlyRate*(Math.pow((1.0+monthlyRate), termInMonths)))/((Math.pow((1.0+monthlyRate), termInMonths)-1));
		return monthlyPayment;
	}
}
