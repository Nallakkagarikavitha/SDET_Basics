import java.util.Scanner;
public class Taxcalculator_30per {
	

	
	    public static void main(String[] args) {
	        // Create a Scanner object to get user input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the taxable income
	        System.out.print("Enter the taxable income: $");
	        double taxableIncome = scanner.nextDouble();

	        // Close the Scanner to prevent resource leak
	        scanner.close();

	        // Check if taxable income is greater than $75,000
	        if (taxableIncome > 75000) {
	            // Tax rate is 30%
	            double taxRate = 0.30;
	            double taxAmount = taxableIncome * taxRate;

	            System.out.println("Taxable Income: $" + taxableIncome);
	            System.out.println("Tax Rate: " + (taxRate * 100) + "%");
	            System.out.println("Tax Amount: $" + taxAmount);
	        } else {
	            // Tax rate is not applicable
	            System.out.println("Taxable Income: $" + taxableIncome);
	            System.out.println("Tax Rate: 0% (Not Applicable)");
	            System.out.println("No tax is owed.");
	        }
	    }
	}



