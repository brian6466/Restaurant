import java.util.ArrayList;

public class Food {
	ArrayList<Food> starters = new ArrayList<Food>();
	ArrayList<Food> maincourse = new ArrayList<Food>();
	ArrayList<Food> desert = new ArrayList<Food>();
	ArrayList<Food> drinks = new ArrayList<Food>();
	private String foodName;
	private double foodPrice;
	
	public Food(String foodName, double foodPrice) {
		this.setFoodName(foodName);
		this.setFoodPrice(foodPrice);
	}
	
	public void addStarter(Food f) {
		starters.add(f);
	}
	
	public void removeStarter(Food f) {
		starters.remove(f);
	}
	
	public void addMaincourse(Food f) {
		maincourse.add(f);
	}
	
	public void removeMaincourse(Food f) {
		maincourse.remove(f);
	}
	
	public void addDesert(Food f) {
		desert.add(f);
	}
	
	public void removeDesert(Food f) {
		desert.remove(f);
	}
	
	public void addDrinks(Food f) {
		drinks.add(f);
	}
	
	public void removeDrinks(Food f) {
		drinks.remove(f);
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public double getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}
	
}
