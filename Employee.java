
public class Employee {
	
	private String firstName;
	private String lastName;
	private int employeeID;
	private double salary;
	
	public Employee() {
		salary = 0.0;
	}
	
	public void setFirst(String first) {
		firstName = first;
	}
	
	public String getFirst() {
		return firstName;
	}
	
	public void setLast(String last) {
		lastName = last;
	}
	
	public String getlast() {
		return lastName;
	}
	
	public void setID(int id) {
		employeeID = id;
	}
	
	public int getID() {
		return employeeID;
	}
	
	public void setSalary(double s) {
		salary = s;
	}
	
	public double getSalary() {
		return salary;
	}
	
	
	public void employeeSummary() {
		System.out.println("Employee: " + lastName + ", " + firstName);
		System.out.println("ID Number: " + String.valueOf(employeeID));
		System.out.println("Salary: " + String.valueOf(salary));
	}
}
