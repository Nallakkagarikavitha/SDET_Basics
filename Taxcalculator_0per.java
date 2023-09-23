
public class Taxcalculator_0per {
	 public static void main(String[] args) {
	        double taxableIncome = 20000.0; 

	       
	        if (taxableIncome <= 25000.0) {
	            System.out.println("Tax Rate: 0%");
	        } else {
	            System.out.println("Tax Rate: Some other rate for taxable income over $25,000");
	        }
	    }

}
