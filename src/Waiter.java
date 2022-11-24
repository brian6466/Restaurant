import java.util.ArrayList;

public class Waiter extends Staff {

	public Waiter(String number, String name, int salary) {
		super(number, name, salary);
	}

	public void completeOrder(Customers C) {
		double totalprice = 0;

		for (int i = 0; i <= C.getOrder().size(); i++) {
			totalprice = totalprice + C.getOrder().get(i).getFoodPrice();
		}
	}

}
