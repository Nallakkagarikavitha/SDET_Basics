
public class IT_Calculator {
	
	    // Fields to store basic information
	    private String employeeName;
	    private int employeeId;
	    private double salary;
	    private double taxRate;

	    // Constructor to initialize the fields
	    public IT_Calculator(String employeeName, int employeeId, double salary, double taxRate) {
	        this.employeeName = employeeName;
	        this.employeeId = employeeId;
	        this.salary = salary;
	        this.taxRate = taxRate;
	    }

	    // Method to calculate income tax
	    public double calculateIncomeTax() {
	        double incomeTax = salary * (taxRate / 100);
	        return incomeTax;
	    }

	    // Method to display employee information and income tax
	    public void displayEmployeeInfo() {
	        System.out.println("Employee Name: " + employeeName);
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Salary: $" + salary);
	        System.out.println("Tax Rate: " + taxRate + "%");
	        System.out.println("Income Tax: $" + calculateIncomeTax());
	    }

	    public static void main(String[] args) {
	        // Create an IT_Calculator object
	        IT_Calculator employee = new IT_Calculator("John Doe", 12345, 50000, 20);

	        // Display employee information and income tax
	        employee.displayEmployeeInfo();
	    }
	}

	


