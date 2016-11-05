import java.text.NumberFormat;
import java.util.Scanner;

public class WorkerPay {
	private double workerHours;
	private double workerWageRate;
	private int workerDependents;
	
	private NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
	
	WorkerPay(){
		workerHours = 0.0;
		workerWageRate = 0.0;
		workerDependents = 0;
	}
	
	public void prompt4Data(double hours, double wageRate, int dependents){
		workerHours = hours;
		workerWageRate = wageRate;
		workerDependents = dependents;
	}
	
	public double grossPay(){
		double pay;
		if(workerHours > 0.0 && workerHours <= 40.0){
			pay = workerWageRate * workerHours;
			return pay;
		}
		else if(workerHours <= 60.0){
			pay = (workerWageRate * 40.)+(workerWageRate*(1.5*(workerHours-40.)));
			return pay;
		}
		else if(workerHours > 60.0){
			pay = (workerWageRate * 40.)+(1.5*(workerWageRate*20.))+((workerHours-60.)*2.);
			return pay;
		}
		else return 0.0;
	}
	
	public double fedTax(){
		double grossPay = grossPay();
		double tax = (grossPay * .1) - (25.0 * workerDependents);
		if(tax<0){
			return 0.0;
		}
		else{
			return tax;
		}
	}
	
	public String toString(){
		String result = "\nThe Hours worked is: " + workerHours
				+ "\nThe Hourly Rate is: " + currencyFormat.format(workerWageRate)
				+ "\nThe Number of Dependents is: " + workerDependents
				+ "\nThe Gross income is: " + currencyFormat.format(grossPay())
				+ "\nThe Federal Tax withheld is: " + currencyFormat.format(fedTax())
				+ "\nThe Take home pay is: " + currencyFormat.format((grossPay() - fedTax()));
		return result;
	}
	
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		WorkerPay worker1 = new WorkerPay();
		WorkerPay worker2 = new WorkerPay();
		WorkerPay worker3 = new WorkerPay();
		
		System.out.println("Worker 1");
		
		System.out.println("How many hours?");
		double hour1 = scanner.nextDouble();
		System.out.println("What is your wage rate?");
		double wageRate1 = scanner.nextDouble();
		System.out.println("How many dependents do you have?");
		int dependent1 = scanner.nextInt();
		worker1.prompt4Data(hour1,wageRate1,dependent1);
		
		System.out.println(worker1.toString());
		
		System.out.println("Worker 2");
		
		System.out.println("How many hours?");
		double hour2 = scanner.nextDouble();
		System.out.println("What is your wage rate?");
		double wageRate2 = scanner.nextDouble();
		System.out.println("How many dependents do you have?");
		int dependent2 = scanner.nextInt();
		worker2.prompt4Data(hour2, wageRate2, dependent2);
		
		System.out.println(worker2.toString());
		
		System.out.println("Worker 3");
		
		System.out.println("How many hours?");
		double hour3 = scanner.nextDouble();
		System.out.println("What is your wage rate?");
		double wageRate3 = scanner.nextDouble();
		System.out.println("How many dependents do you have?");
		int dependent3 = scanner.nextInt();
		worker3.prompt4Data(hour3, wageRate3, dependent3);
	
		System.out.println(worker3.toString());
	}
}
