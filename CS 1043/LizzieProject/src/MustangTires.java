import java.util.Scanner;
public class MustangTires {
	public static void main(String [] args){
		Scanner console = new Scanner(System.in);
		
		String menu = "**Welcome to Mustang Tires.  We have the tires you need!**\n\n"
				+ "Choose from the following options:\n"
				+ "1) Purchase tires\n"
				+ "2) Select a tire delivery option\n"
				+ "3) Schedule a tire installation appointment\n"
				+ "4) View invoice\n"
				+ "9) Cancel order and exit store";
		
		System.out.println(menu);
	
		String chosen = console.next();
		int chosenNumber = Integer.parseInt(chosen);
		
		while(!(chosenNumber == 1 || chosenNumber == 2 || chosenNumber == 3 || chosenNumber == 4 || chosenNumber == 9)){
			System.out.println("Select an option from the following menu.");
			System.out.println(menu);
			
			chosen = console.next();
			chosenNumber = Integer.parseInt(chosen);
		}
		console.close();
	}
}
