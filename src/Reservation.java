import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Reservation {
	private int ReservationId = 0;
	private String ReservationName = "";
	private int ReservationSeatNo = 0;
	private int ReservationPhoneNo = 0;
	private String time;
	private int capacity;

	public Reservation(Restaurant r, String ReservationName, int ReservationSeatNo, int capacity,
			int ReservationPhoneNo, String time) {
		setReservationId(getReservationId() + 1);
		this.ReservationName = ReservationName;
		this.ReservationSeatNo = ReservationSeatNo;
		this.ReservationPhoneNo = ReservationPhoneNo;
		this.time = time;
		this.capacity = capacity;
		Reservation res = new Reservation(ReservationName, ReservationSeatNo, capacity, ReservationPhoneNo, time);
		r.reservations.add(res);
		for (int i = 0; i < r.getTables().size(); i++) {
			if (r.getTables().get(i).getTableNo() == ReservationSeatNo) {
				r.unavailableTables.add(r.tables.get(i));
				r.tables.remove(i);
			}
		}
	}

	public Reservation(String ReservationName, int ReservationSeatNo, int capacity, int ReservationPhoneNo,
			String time) {
		setReservationId(getReservationId() + 1);
		this.ReservationName = ReservationName;
		this.ReservationSeatNo = ReservationSeatNo;
		this.ReservationPhoneNo = ReservationPhoneNo;
		this.time = time;
		this.capacity = capacity;

	}

	public String toString() {
		String result = "";
		result += "ReservationName: " + ReservationName + "\n";
		result += "ReservationSeatNo: " + ReservationSeatNo + "\n";
		result += "ReservationPhoneNo: " + ReservationPhoneNo + "\n";
		result += "time: " + time + "\n";
		result += "capacity: " + capacity + "\n";
		return result;
	}

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Reservation> reservations = new ArrayList<Reservation>();
		File csvFile = new File("reservation.csv");
		PrintWriter out = new PrintWriter(csvFile);

		for (Reservation reservation : reservations) {
			out.println(reservation.toString());

		}
		out.close();

	}

	public int getReservationId() {
		return ReservationId;
	}

	public int getReservationPhoneNo() {
		return ReservationPhoneNo;
	}

	public int getReservationSeatNo() {
		return ReservationSeatNo;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setReservationId(int reservationId) {
		ReservationId = reservationId;
	}
}