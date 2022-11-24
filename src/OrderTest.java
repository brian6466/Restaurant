
public class OrderTest {
	public static void main(String[] args) {
		
		Restaurant res1 = new Restaurant(1);
		Food Lasagne_Bolognese = new Food("Lasagne Bolognese ", 12.99);
		Food Fanta = new Food("Fanta ", 3.00);
	

		res1.addMaincourse(Lasagne_Bolognese);
		res1.addDrinks(Fanta);
		
		Table t1 = new Table(1, 2);
		Table t2 = new Table(2, 4);
		Table t3 = new Table(3, 3);
		Table t4 = new Table(4, 3);
		
		
		//Kevins a walk in customer.
		Customers kevin = new Customers("1234567890", "Kevin");
		
		//Kevin sits in table 1
		res1.removeTable(t1);
		
		//Waiter in restaurant
		Waiter sarah = new Waiter("1234567777", "Sarah", 20000);
		
		//Kevin buys a fanta and lasagne
		kevin.addToOrder(Fanta);
		kevin.addToOrder(Lasagne_Bolognese);
		
		//Sarah adds up price of order.
		sarah.completeOrder(kevin);
		System.out.println("The total price is: " + sarah.completeOrder(kevin));
		
		Chef c = new Chef("1","joe",1000);
        c.CheckOrder(true);
        
        kevin.PayBill();
	}
}
