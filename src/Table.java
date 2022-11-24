import java.util.ArrayList;

public class Table {
	private int capacity;
	private int tableNo;
	
	public Table(int tableNo, int capacity) {
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
