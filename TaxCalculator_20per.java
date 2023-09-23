import java.util.Scanner;

public class TaxCalculator_20per {
	
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter your taxable income: $");
	        double taxableIncome = scanner.nextDouble();
	        
	        double taxRate;
	        
	        if (taxableIncome > 50000 && taxableIncome <= 75000) {
	            taxRate = 0.20; // 20%
	        } else {
	            taxRate = 0.0; // Default to 0% if not in the specified range
	        }
	        
	        double taxAmount = taxableIncome * taxRate;
	        
	        System.out.println("Tax Rate: " + (taxRate * 100) + "%");
	        System.out.println("Tax Amount: $" + taxAmount);
	        
	        scanner.close();
	    }
	}


