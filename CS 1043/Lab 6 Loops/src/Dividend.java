import java.util.Scanner;
public class Dividend {
	public static void main(String [] args){
		System.out.print("Enter the divident, a number to factor: ");
		Scanner console = new Scanner(System.in);
		
		int input = console.nextInt();
		int dividend = input;
		
		while(dividend != 1){
			System.out.println("Enter a divisor: ");
			int divisor = console.nextInt();
			
			if((dividend % divisor) == 0){
				System.out.println(divisor + " is a factor of " + input);
				dividend /= divisor;
				System.out.println(dividend + " is the new dividend.");
			}
			else
			{
				System.out.println(divisor + " is not a factor, try again for " + dividend);
			}
		}
		System.out.println("\nExit program.");
		console.close();
	}
}
