import java.util.ArrayList;

public class Customers extends Person {

	private int customerID = 0;
	ArrayList<Food> selectedOrder = new ArrayList<Food>();
	
	public Customers(String number, String name) {
		super(number, name);
		setCustomerID(getCustomerID() + 1);
	}
	
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public void PayBill(){
		System.out.println("Bill has been paid ");
	}
	
	public void addToOrder(Food f) {
		selectedOrder.add(f);
	}
	
	public ArrayList<Food> getOrder(){
		return selectedOrder;
		
	}
}
