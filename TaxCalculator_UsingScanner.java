import java.util.Scanner;
public class TaxCalculator_UsingScanner {

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user to enter taxable income
	        System.out.print("Enter your taxable income: ");
	        
	        // Read the taxable income from the user
	        double taxableIncome = scanner.nextDouble();
	        
	        // Close the scanner to free up resources
	        scanner.close();
	        
	        // Calculate and display the tax
	        double tax = calculateTax(taxableIncome);
	        System.out.println("The tax on your taxable income of $" + taxableIncome + " is: $" + tax);
	    }
	    
	    public static double calculateTax(double income) {
	       
	        double tax = 0.0;
	        
	        if (income <= 10000) {
	            tax = income * 0.1;
	        } else if (income <= 50000) {
	            tax = 10000 * 0.1 + (income - 10000) * 0.2;
	        } else {
	            tax = 10000 * 0.1 + 40000 * 0.2 + (income - 50000) * 0.3;
	        }
	        
	        return tax;
	    }
	}


