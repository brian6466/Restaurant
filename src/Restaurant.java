import java.util.ArrayList;

public class Restaurant {
	ArrayList<Table> tables = new ArrayList<Table>();
	ArrayList<Food> starters = new ArrayList<Food>();
	ArrayList<Food> maincourse = new ArrayList<Food>();
	ArrayList<Food> desert = new ArrayList<Food>();
	ArrayList<Food> drinks = new ArrayList<Food>();
	ArrayList<Reservation> reservations = new ArrayList<Reservation>();
	
	private int restaurantID;

	public Restaurant(int restaurantID) {
		this.setRestaurantID(restaurantID);
	}

	public int getRestaurantID() {
		return restaurantID;
	}

	public void setRestaurantID(int restaurantID) {
		this.restaurantID = restaurantID;
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
}
