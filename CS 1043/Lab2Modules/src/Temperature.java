/*
 *Name: Nihaal Manesia
 *Lab Section: L2
 *Lecture Section: 01
 *Date: 9/1/2016
 *Assignment: Temperature Conversion
 *Description: Take in a celsius and convert to farenheit 
 */
import java.util.Scanner;

public class Temperature {
	public static void main(String [] args){
		Scanner console = new Scanner(System.in);
		
		System.out.println("Please import a temperature in degrees fahrenheit: ");
		double fahrenheit = console.nextDouble();
		double celcius = fToC(fahrenheit);
		System.out.println("The temperature in celsius is :" +celcius);
		
		System.out.println("Please import a temperature in degrees celcius: ");
		double c = console.nextDouble();
		double f = cToF(c);
		System.out.println("The temperature in fahreheit is :" +f);
	}
	
	public static double fToC(double f){
		double cel = (f-32.)*5./9.;
		return cel;
	}
	
	public static double cToF(double c){
		double f = ((9/5)*c)+32;
		return f;
	}
}
