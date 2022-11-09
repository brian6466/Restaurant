
public class Table {
	private int capacity;
	private int tableNo;
	
	public Table(int capacity, int tableNo) {
		this.capacity = capacity;
		this.tableNo = tableNo;
	}

	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getTableNo() {
		return tableNo;
	}
	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}
}
