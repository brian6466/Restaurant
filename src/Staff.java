
public class Staff extends Person {
	
	private int salary;
	
	public Staff(String email, String number, String name, int salary) {
		super(email, number, name);
		this.setSalary(salary);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
}
