import java.util.Scanner;
	
public class TaxCalculator_Month {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for their monthly income
	        System.out.print("Enter your monthly income: $");
	        double income = scanner.nextDouble();

	        // Calculate and print the tax
	        double tax = calculateTax(income);
	        System.out.printf("You should pay $%.2f in taxes this month.%n", tax);

	        scanner.close();
	    }

	    public static double calculateTax(double income) {
	        double tax = 0.0;

	        if (income <= 1000) {
	            tax = income * 0.10;
	        } else if (income <= 2000) {
	            tax = 1000 * 0.10 + (income - 1000) * 0.15;
	        } else {
	            tax = 1000 * 0.10 + 1000 * 0.15 + (income - 2000) * 0.20;
	        }


	        return tax;
	    }
	}


