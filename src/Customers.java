import java.util.ArrayList;

/**
 * Class to represent a Customer
 *
 * */
public class Customers extends Person {

	private int customerID = 0;
	ArrayList<Food> selectedOrder = new ArrayList<Food>();
	
	/**
    Customer constructor.
    @param number (String number of customer)
    @param name (String name of customer)
	 */
	public Customers(String number, String name) {
		super(number, name);
		setCustomerID(getCustomerID() + 1);
	}

	/**
    Gets customer ID
    @return customerID of customer
	 */
	public int getCustomerID() {
		return customerID;
	}

	/**
    Sets customer ID
    @param customerID (Integer customerID of customer)
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
    @param f (Food object to add to order)
	 */
	public void addToOrder(Food f) {
		selectedOrder.add(f);
	}

	/**
    returns order array list
    @return Arraylist of food objects in the order
	 */
	public ArrayList<Food> getOrder() {
		return selectedOrder;

	}
}