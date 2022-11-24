import java.util.ArrayList;

public class Table {
	private int capacity;
	private int tableNo;

	 /**
     * Makes a Table Object
     * @param Table Number
     * @param Capacity
     */
	public Table(int tableNo, int capacity) {
		this.capacity = capacity;
		this.tableNo = tableNo;
	}

	 /**
     * Gets Capacity
     * @return Integer
     */
	public int getCapacity() {
		return capacity;
	}

	/**
     * Sets Capacity
     * @param capacity
     */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/**
     * Gets Table Number
     * @return Integer
     */
	public int getTableNo() {
		return tableNo;
	}

	/**
     * Sets Table Number
     * @param Table Number
     */
	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}

	/**
     * Prints Book Object
     * @return String
     */
	public String toString() {
		String result = "";
		result += "Capacity: " + capacity;
		result += " Table Number: " + tableNo + "\n";
		return result;
	}
}
