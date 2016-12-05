import java.util.Scanner;

public class LabShips {
	public static void main(String [] args){
		Scanner input = new Scanner( System.in );
		
	    System.out.printf( "Please enter ship name: " );
	    String name = input.next();
	    System.out.printf( "Please enter the crew complement: " );
	    int crew = input.nextInt();
	    System.out.printf( "Is the ship a Freighter or a Liner?\n" );
	    System.out.printf( "Enter 'F' for Freighter, or 'L' for Liner: " );
	    String type = input.next();
	    
	    if ( type.equalsIgnoreCase( "f" ) ) // for a ship of type: Freighter.
	    {
	       System.out.printf( "Please enter your freight capacity in tons: " );
	       double capacity = input.nextDouble();
	       Freighter aship = new Freighter(crew, name, capacity); // Student: Construct a Freighter object here
	       System.out.print(aship.toString());
	       System.out.printf( "Please change the crew number: " );
	       crew = input.nextInt();
	       aship.setCrew(crew);
	       System.out.printf( "Please change the ship capacity: " );
	       capacity = input.nextDouble();
	       aship.setCapacity(capacity);
	       System.out.print(aship.toString());
	       /* display all the instance variables after the changes here */
	    } else { // Repeat the above for a ship of type Liner in the else block.
	    	System.out.printf( "Please enter your number of passengers: " );
	    	int passengers = input.nextInt();
	    	Liner aliner = new Liner(crew, name, passengers);
	    	System.out.print(aliner.toString());
	    	System.out.printf( "Please change the crew number: " );
	    	crew = input.nextInt();
	    	aliner.setCrew(crew);
	    	System.out.printf("Please change the number of passengers: ");
	    	passengers = input.nextInt();
	    	aliner.setPassengers(passengers);
	    	System.out.print(aliner.toString());
	    }
	}
}