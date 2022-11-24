
public class Table {
    private int capacity;
    private int tableNo;

    /**
     * Makes a Table Object
     * @param tableNo (integer table)
     * @param capacity (integer capacity)
     */
    public Table(int tableNo, int capacity) {
        this.capacity = capacity;
        this.tableNo = tableNo;
    }

    /**
     * Gets Capacity
     * @return capacity ie number of people that can fit
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets Capacity
     * @param capacity (integer capacity)
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Gets Table Number
     * @return tableNo i.e number associated with the table
     */
    public int getTableNo() {
        return tableNo;
    }

    /**
     * Sets Table Number
     * @param tableNo (integer table number)
     */
    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    /**
     * Prints Book Object
     * @return resulted String
     */
    public String toString() {
        String result = "";
        result += "Capacity: " + capacity;
        result += " Table Number: " + tableNo + "\n";
        return result;
    }
}
