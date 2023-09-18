
public class Manager extends Employee{
	
	private String department;
	
	public Manager() {
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String d) {
		department = d;
	}
	
	public void employeeSummary() {
		System.out.println("Employee: " + getlast() + ", " + getFirst());
		System.out.println("ID Number: " + String.valueOf(getID()));
		System.out.println("Salary: " + String.valueOf(getSalary()));
		System.out.println("Department: " + department);
	}
}
