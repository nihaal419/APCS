package debug;

import java.util.Scanner;

public class debugger {

	public static void main(String[] args) {
		int sum=0;
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name=console.next();
		sum=getSum();
		System.out.println("The sum is: "+sum);
		System.out.println("Your name: "+name);
		console.close();
	}
	public static int getSum()
	{
		int ss=0;
		for(int ii=1;ii<=10; ii++)
			ss +=ii;
		return ss;
	}
}
