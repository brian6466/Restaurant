import java.util.ArrayList;

/**
 * Class to represent a restaurant
 *
 * */
public class Restaurant {
    ArrayList<Table> tables = new ArrayList<Table>();
    ArrayList<Table> unavailableTables = new ArrayList<Table>();
    ArrayList<Food> starters = new ArrayList<Food>();
    ArrayList<Food> maincourse = new ArrayList<Food>();
    ArrayList<Food> desert = new ArrayList<Food>();
    ArrayList<Food> drinks = new ArrayList<Food>();
    ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    private int restaurantID;

    /**
     * constructor
     * @param restaurantID (integer restaurantID)
     * */
    public Restaurant(int restaurantID) {
        this.restaurantID = restaurantID;
    }

    /**
     * @return reservations
     * */
    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    /**
     *
     * @return starters
     */

    public ArrayList<Food> getStarters() {
        return starters;
    }

    /**
     * method to remove reservations
     * @param r (Object Reservation r)
     */

    public void removeReservation(Reservation r) {
        for (int i = 0; i < reservations.size(); i++) {
            if (reservations.get(i).getReservationSeatNo() == r.getReservationSeatNo()) {
                Table t = new Table(r.getReservationSeatNo(), r.getCapacity());
                tables.add(t);
                unavailableTables.remove(t);
            }
        }
        reservations.remove(r);
    }

    /**
     * gets restaurant ID
     * @return restaurantID
     */
    public int getRestaurantID() {
        return restaurantID;
    }

    /**
     * sets restaurant ID
     * @param restaurantID (integer restaurantID)
     */
    public void setRestaurantID(int restaurantID) {
        this.restaurantID = restaurantID;
    }

    /**
     * add starters to food
     * @param f (Object Food f )
     */
    public void addStarter(Food f) {
        starters.add(f);
    }

    /**
     * remove starter from food
     * @param f (Object Food f )
     */
    public void removeStarter(Food f) {
        starters.remove(f);
    }

    /**
     * adds main course to food
     * @param f (Object Food f )
     */
    public void addMaincourse(Food f) {
        maincourse.add(f);
    }

    /**
     * remove main course from food
     * @param f (Object Food f )
     */
    public void removeMaincourse(Food f) {
        maincourse.remove(f);
    }

    /**
     * adds desserts to food
     * @param f (Object Food f )
     */
    public void addDesert(Food f) {
        desert.add(f);
    }

    /**
     * remove desserts from food
     * @param f (Object Food f )
     */
    public void removeDesert(Food f) {
        desert.remove(f);
    }

    /**
     * adds drinks to food
     * @param f (Object Food f )
     */
    public void addDrinks(Food f) {
        drinks.add(f);
    }

    /**
     * remove drinks from food
     * @param f (Object Food f )
     */
    public void removeDrinks(Food f) {
        drinks.remove(f);
    }

    /**
     * adds table
     * @param t (Object Table t )
     */
    public void addTable(Table t) {
        tables.add(t);
    }

    /**
     * removes table
     * @param t (Object Table t )
     */
    public void removeTable(Table t) {
        tables.remove(t);
        unavailableTables.add(t);

    }

    /**
     * adds used table
     * @param t (Object Table t )
     */
    public void addBackTable(Table t) {
        unavailableTables.remove(t);
        tables.add(t);
    }

    /**
     * method to get tables
     * @return tables
     */
    public ArrayList<Table> getTables() {
        return tables;
    }

}