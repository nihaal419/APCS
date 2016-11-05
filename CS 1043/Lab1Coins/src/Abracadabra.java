import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Abracadabra {
	public static void main(String [] args){
		final double PENNY_VALUE = 0.01;
		final double NICKEL_VALUE = 0.05;
		final double DIME_VALUE = 0.1;
		final double QUARTER_VALUE = 0.25;
		final double HALFDOLLAR_VALUE = 0.50;
		final double DOLLAR_VALUE = 1.0;
		
		Scanner console = new Scanner(System.in);
		
		System.out.printf("\nHow many pennies do you have?\n");
		int pennies = console.nextInt();
		
		System.out.printf("\nHow many nickels do you have?\n");
		int nickels = console.nextInt();
		
		System.out.printf("\nHow many dimes do you have?\n");
		int dimes = console.nextInt();
		
		System.out.printf("\nHow many quarters do you have?\n");
		int quarters = console.nextInt();
		
		System.out.printf("\nHow many half-dollar coins do you have?\n");
		int halfDollar = console.nextInt();
		
		System.out.printf("\nHow many dollar coins do you have?\n");
		int dollarCoin = console.nextInt();
		
		// total value of the coins
		double total = ((pennies * PENNY_VALUE) + (nickels * NICKEL_VALUE) + (dimes * DIME_VALUE) + (quarters * QUARTER_VALUE) + (halfDollar * HALFDOLLAR_VALUE) + (dollarCoin * DOLLAR_VALUE));
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
		
		System.out.printf("Total value = " + formatter.format(total) );
	}
}
