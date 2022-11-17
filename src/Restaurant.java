import java.util.ArrayList;

public class Restaurant {
	ArrayList<Table> tables = new ArrayList<Table>();
	ArrayList<Food> starters = new ArrayList<Food>();
	ArrayList<Food> maincourse = new ArrayList<Food>();
	ArrayList<Food> desert = new ArrayList<Food>();
	ArrayList<Food> drinks = new ArrayList<Food>();
	ArrayList<Reservation> reservations = new ArrayList<Reservation>();
	private String location;
	private double noOfTables;
	private int restaurantID;

	public Restaurant(String location, double noOfTables, int restaurantID) {
		this.location = location;
		this.noOfTables = noOfTables;
		this.setRestaurantID(restaurantID);
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getNoOfTables() {
		return noOfTables;
	}

	public void setNoOfTables(double noOfTables) {
		this.noOfTables = noOfTables;
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
