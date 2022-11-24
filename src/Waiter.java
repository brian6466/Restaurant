public class Waiter extends Staff {
    /**
     * constructor
     * @param number (String of number)
     * @param name (String of watier name)
     * @param salary (int of waiter salary)
     */
    public Waiter(String number, String name, int salary) {
        super(number, name, salary);
    }

    /**
     * complete order method which contains a for loop that returns total price
     *
     * @param C(C of Customer)
     */
    public double completeOrder(Customers C) {
        double totalprice = 0;

        for (int i = 0; i < C.getOrder().size(); i++) {
            totalprice = totalprice + C.getOrder().get(i).getFoodPrice();
        }
        return totalprice;
    }

}
