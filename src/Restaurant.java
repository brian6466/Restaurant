import java.util.ArrayList;

public class Restaurant {
	ArrayList<Table> tables = new ArrayList<Table>();
	ArrayList<Table> unavailableTables = new ArrayList<Table>();
	ArrayList<Food> starters = new ArrayList<Food>();
	ArrayList<Food> maincourse = new ArrayList<Food>();
	ArrayList<Food> desert = new ArrayList<Food>();
	ArrayList<Food> drinks = new ArrayList<Food>();
	ArrayList<Reservation> reservations = new ArrayList<Reservation>();
	
	private int restaurantID;

	public Restaurant(int restaurantID) {
		this.restaurantID = restaurantID;
	}
	
	public ArrayList<Food> getStarters(){
		return starters;
	}
	
	public void removeReservation(Reservation r){
		reservations.remove(r);
		
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
	
	public void addTable(Table t) {
		tables.add(t);
	}
	
	public void removeTable(Table t) {
		tables.remove(t);
		unavailableTables.add(t);
		
	}
	
	public void addBackTable(Table t) {
		unavailableTables.remove(t);
		tables.add(t);
	}
	
	public ArrayList<Table> getTables() {
		return tables;
	}
	
}