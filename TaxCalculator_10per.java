import java.util.Scanner;

public class TaxCalculator_10per {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter your taxable income: $");
	        double taxableIncome = scanner.nextDouble();
	        
	        double taxRate;
	        
	        if (taxableIncome > 25000 && taxableIncome <= 50000) {
	            taxRate = 0.10; // 10% tax rate
	        } else {
	            taxRate = 0.0; // 0% tax rate for other cases
	        }
	        
	        double taxAmount = taxableIncome * taxRate;
	        
	        System.out.println("Taxable Income: $" + taxableIncome);
	        System.out.println("Tax Rate: " + (taxRate * 100) + "%");
	        System.out.println("Tax Amount: $" + taxAmount);
	    }
	}



