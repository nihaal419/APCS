public class Table {
	public static void main(String [] args){
		double initialLoan = 100000.00;
		double lowInterest = 3.0;
		double highInterest = 6.0;
		double payment = 0;
		int year = 15;
		int endYear = 30;
		
		String prompt = "Table of monthly payments for a dollar loan amount of $100000.00";
		
		System.out.printf("%s\n\n%-10s%-10s%-10s%-10s%-10s\n", prompt, "Years:", "15", "20", "25", "30");
		
		for(int a=0;a<50;a++){
			System.out.printf("%s","-");
		}
		
		System.out.println();
		
		for(double x=lowInterest;x<=highInterest;x+=.5){
			System.out.printf("%2.1f%s", x, "%");
			for(int y=year;y<=endYear;y+=5){
				payment = MonthlyPayment.calculatePayment(initialLoan, y, lowInterest);
				System.out.printf("%4s%-5.2f", "$", payment);
			}
			//System.out.printf("\n%-3.1f%-3s %s%-10.2f%s%-10.2f%s%-10.2f%s%-10.2f\n", lowInterest, "%", "$", payment, "$", payment, "$", payment, "$", payment);
			System.out.println();
		}
	}
}
