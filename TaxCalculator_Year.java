import java.util.Scanner;
public class TaxCalculator_Year {
	

	
	    public static void main(String[] args) {
	        // Define tax rate constants
	        final double TAX_RATE_10 = 0.10;
	        final double TAX_RATE_20 = 0.20;
	        final double TAX_RATE_30 = 0.30;

	        // Define income thresholds
	        final double THRESHOLD_1 = 10000.0;
	        final double THRESHOLD_2 = 20000.0;

	        // Initialize variables
	        double income;
	        double taxPaid = 0.0;

	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);

	        // Ask the user for their annual income
	        System.out.print("Enter your annual income: ");
	        income = scanner.nextDouble();

	        // Calculate tax based on income
	        if (income <= THRESHOLD_1) {
	            taxPaid = income * TAX_RATE_10;
	        } else if (income <= THRESHOLD_2) {
	            taxPaid = THRESHOLD_1 * TAX_RATE_10 + (income - THRESHOLD_1) * TAX_RATE_20;
	        } else {
	            taxPaid = THRESHOLD_1 * TAX_RATE_10 + (THRESHOLD_2 - THRESHOLD_1) * TAX_RATE_20
	                    + (income - THRESHOLD_2) * TAX_RATE_30;
	        }

	        // Close the scanner
	        scanner.close();

	        // Print the calculated tax
	        System.out.println("You paid $" + taxPaid + " in taxes this year.");
	    }
	}



