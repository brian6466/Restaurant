
public class Chef extends Staff {
    /**
     * constructor
     * @param number (id number)
     * @param name (chefs name)
     * @param salary (chefs salary)
     */
    public Chef(String number, String name, int salary) {
        super(number, name, salary);
    }

    /**
     * Method that checks whether order is done or not
     * @param order (food order )
     */
    // Method to say if order is ready
    public void CheckOrder(boolean order){
        if(order == true){
            System.out.println("Your order is complete");
        }
        else if (order == false){
            System.out.println("Your order has not been completed, Please wait patiently");
            System.out.println("Thank You :)");
        }
    }

    public static void main(String[] args) {
        Chef c = new Chef("1","joe",1000);
        c.CheckOrder(true);
    }

}
