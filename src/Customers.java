import java.util.ArrayList;

public class Customers extends Person {

	private int customerID = 0;
	ArrayList<Food> selectedOrder = new ArrayList<Food>();
	
	/**
    Customer contructor.
    @param number
    @param name
	 */
	public Customers(String number, String name) {
		super(number, name);
		setCustomerID(getCustomerID() + 1);
	}

	/**
    Gets customer ID
    @return customerID
	 */
	public int getCustomerID() {
		return customerID;
	}

	/**
    Sets customer ID
    @param customerID
	 */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	//Pays the Bill
	public void PayBill() {
		System.out.println("Bill has been paid ");
	}

	/**
    Adds food to order arraylist
    @param Food
	 */
	public void addToOrder(Food f) {
		selectedOrder.add(f);
	}

	/**
    returns order array list
    @return ArrayList
	 */
	public ArrayList<Food> getOrder() {
		return selectedOrder;

	}
}
