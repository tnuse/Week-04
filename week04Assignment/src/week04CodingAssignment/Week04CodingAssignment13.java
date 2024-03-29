package week04CodingAssignment;

public class Week04CodingAssignment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	// Variables for methods 
		double balance = 43963.13;
		double monthsOfPayments = 72.0;
		double interestRate = 0.045;
		double monthlyPayments = 697.87;
		
	// 	Calling totalMonthlyInterest Method for the value of double monthlyInterest.
		double monthlyInterest = (totalInterestPaid(balance, monthsOfPayments, interestRate, monthlyPayments));
		
		// Using System.out.printf to format the balance double with 2 decimal places to reflect a dollar amount.	
		System.out.printf("With a loan amount of: $%.2f and monthly payments of: $" + monthlyPayments + "\n",balance );
		

		// Using System.out.printf to format the monthlyInterest double with 2 decimal places to reflect a dollar amount and interest rate.	
		System.out.printf("You will pay a total of $%.2f in interest over "+ monthsOfPayments + " months, at %.2f percent interest.\n", monthlyInterest, (interestRate * 100));
		
	
	}  // **** END OF MAIN ****
	
	// Method to calculate return total interest paid over 'x' number of months.
	public static double totalInterestPaid (double balance, double monthsOfPayments, double interestRate, double monthlyPayments) {
		// create double variables for equation
		double newBalance = balance + (balance*(interestRate/12));
		double interestAmount = 0.00;
		// for loop to calculate total interest paid over 'x' number of months
		for (int i = 0; i <= monthsOfPayments; i++) {
			newBalance += (newBalance * (interestRate / 12)) - monthlyPayments;
			interestAmount += newBalance * ((interestRate / 12));
	}
		// return double InterestAmount
		return (interestAmount);
	}
	
}
