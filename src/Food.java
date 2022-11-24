
public class Food {

    private String foodName;
    private double foodPrice;

    /**
     * constructor
     * @param foodName
     * @param foodPrice
     */
    public Food(String foodName, double foodPrice) {
        this.setFoodName(foodName);
        this.setFoodPrice(foodPrice);
    }

    /**
     * gets food name
     * @return foodName
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * sets food name
     * @param foodName
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
     * @param foodPrice
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
