
public class TaxCalculator {
	
	    public static void main(String[] args) {
	        
	        double taxableIncome = 50000.0;  
	        double taxPaidPerYear = 12000.0; 

	        double taxPayablePerMonth = taxPaidPerYear / 12.0;

	      
	        System.out.println("Taxable Income: $" + taxableIncome);
	        System.out.println("Tax Paid Per Year: $" + taxPaidPerYear);
	        System.out.println("Tax Payable Per Month: $" + taxPayablePerMonth);
	    }
	}



