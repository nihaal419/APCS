/* 
 * Name: Nihaal Manesia
 * Lab Section: L2
 * Lecture Section: 01
 * Date: 9-1-2016
 * Assignment: Calculating Area of a Square/Rectangle
 * Description: Create a static method to calculate the Square/Rectangle
*/
import java.util.Scanner;

public class Area {
	public static void main(String [] args){
//		Scanner console = new Scanner(System.in);
//		
//		System.out.println("Please enter the length of your side: ");
//		double side = console.nextDouble();
//		
//		double area = squareArea(side);
//		System.out.println("The area of your square is: "+area);
		String sales="Sales";
        String to = "to";
        int val1 = 10000;
        int val2 = 15000;
        int rate1 = 10;
        int rate2 = 15;
        int rate3 = 20;
        char ubar = '_';
        char percent = '%';
System.out.printf( "%-20s%4s\n", sales, "Rate" );
        for ( int i = 1; i <= 24; ++i )
        {
           System.out.printf( "%c", ubar );
        }
        System.out.printf( "\n" );
System.out.printf( "%2s %2s $%5d", "Up", to, val1 ); System.out.printf( "%10d%c\n", rate1, percent ); System.out.printf( "$%5d %2s $%5d", val1, to, val2 ); System.out.printf( "%6d%c\n", rate2, percent ); System.out.printf( "%4s $%5d", "Over", val2 ); System.out.printf( "%11d%c\n", rate3, percent );
	}
	
	public static double rectangleArea(double base, double height){
		double a = base*height;
		return a;
	}
	
	public static double squareArea(double side){
		double b = rectangleArea(side,side);
		return b;
	}
}
