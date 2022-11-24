
public class Person {
	private String name;
	private String email;
	private String number;

	public Person(String number, String name) {
		this.setNumber(number);
		this.setName(name);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
