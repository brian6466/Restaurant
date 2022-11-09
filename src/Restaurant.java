
public class Restaurant {
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
}
