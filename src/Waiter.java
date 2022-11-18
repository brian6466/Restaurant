import java.util.ArrayList;

public class Waiter extends Staff{
	

	public Waiter(String email, String number, String name, int salary) {
		super(email, number, name, salary);
	}
	
	
	public void completeOrder(Customers C) {
		//Not implemented yet.
		double totalprice = 0;
		
		for (int i = 0; i <= C.getOrder().size(); i++) {
			totalprice = totalprice + C.getOrder().get(i).getFoodPrice();
		}
	}

}
