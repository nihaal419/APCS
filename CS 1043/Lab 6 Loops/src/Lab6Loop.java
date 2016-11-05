import java.util.Scanner;

public class Lab6Loop {
	public static void main(String [] args){
		int count = 0;
		int minimum = Integer.MAX_VALUE;
		int maximum = Integer.MIN_VALUE;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a test score: ");
		String input = scan.next();
		
		while(!(input.equalsIgnoreCase("Stop")||input.equalsIgnoreCase("Exit"))){
			count += 1;
			int num = Integer.parseInt(input);
			sum = sum + num;
			if(minimum > num)
				minimum = num;
			if(maximum < num)
				maximum = num;
			System.out.println("Enter the next number or enter stop to end");
			input = scan.next();
		}
		scan.close();
		double average = (double) sum/count;
		System.out.println("There were " + count + " grades entered.\n" + 
				"The minimum grade was " + minimum + "\n" + 
				"The maximum grade was " + maximum + "\n" + 
				"The sum of the grades was " + sum + "\n" + 
				"The average was " + average);
		
	}
}
