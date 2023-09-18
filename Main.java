
public class Main {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirst("John");
		e.setLast("Doe");
		e.setID(1028349);
		e.setSalary(60000.0);
		
		e.employeeSummary();
		
		Manager m = new Manager();
		m.setFirst("Albert");
		m.setLast("Green");
		m.setID(2039487);
		m.setSalary(125000.0);
		m.setDepartment("Research and Development");
		
		m.employeeSummary();
	}

}
