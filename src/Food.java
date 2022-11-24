/**
 * Class to represent Food
 *
 * */
public class Food {

    private String foodName;
    private double foodPrice;

    /**
     * constructor
     * @param foodName (String foodName)
     * @param foodPrice (double foodPrice)
     */
    public Food(String foodName, double foodPrice) {
        this.setFoodName(foodName);
        this.setFoodPrice(foodPrice);
    }

    /**
     * gets name of food
     * @return foodName
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * sets food name
     * @param foodName (String foodName)
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    /**
     * gets food price
     * @return foodPrice
     */
    public double getFoodPrice() {
        return foodPrice;
    }
    /**
     * sets food price
     * @param foodPrice (double foodPrice)
     */
    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    /**
     * toString method
     * @return resulted string
     */
    public String toString() {
        String result = "";
        result += "Food Name: " + foodName + "\n";
        result += "Food Price: " + foodPrice + "\n";
        return result;
    }
}