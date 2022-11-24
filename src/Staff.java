
public class Staff extends Person {
	
	private int salary;
	
	public Staff(String number, String name, int salary) {
		super(number, name);
		this.setSalary(salary);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
}
