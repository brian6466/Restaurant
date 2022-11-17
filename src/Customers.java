
public class Customers extends Person {

	private int customerID = 0;
	
	public Customers(String email, String number, String name) {
		super(email, number, name);
		setCustomerID(getCustomerID() + 1);
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	
	
}
