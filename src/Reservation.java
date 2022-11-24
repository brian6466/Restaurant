import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Class to represent a reservation
 *
 * */
public class Reservation {
    private int ReservationId = 0;
    private String ReservationName = "";
    private int ReservationSeatNo = 0;
    private int ReservationPhoneNo = 0;
    private String time;
    private int capacity;

    /**
     *
     * @param Restaurant (Restaurant object)
     * @param ReservationName (String Name of reservation)
     * @param ReservationSeatNo (Int Table number of reservation)
     * @param Capacity (Int Capacity of the table)
     * @param ReservationPhoneNo (Int Reservation phone number)
     * @param Time (String Time of reservation)
     */
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

    /**
     *
     * @param ReservationName (String Name of reservation)
     * @param ReservationSeatNo (Int Table number of reservation)
     * @param Capacity (Int Capacity of the table)
     * @param ReservationPhoneNo (Int Reservation phone number)
     * @param Time (String Time of reservation)
     */
    public Reservation(String ReservationName, int ReservationSeatNo, int capacity, int ReservationPhoneNo,
                       String time) {
        setReservationId(getReservationId() + 1);
        this.ReservationName = ReservationName;
        this.ReservationSeatNo = ReservationSeatNo;
        this.ReservationPhoneNo = ReservationPhoneNo;
        this.time = time;
        this.capacity = capacity;

    }

    /**
     * toString method
     * @return toString of reservation
     */
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

    /**
     * gets reservation id
     * @return reservationId
     */
    public int getReservationId() {
        return ReservationId;
    }

    /**
     * gets reservation phone number
     * @return reservationPhoneNo
     */
    public int getReservationPhoneNo() {
        return ReservationPhoneNo;
    }

    /**
     * gets reservation seat number
     * @return reservationSeatNo
     */
    public int getReservationSeatNo() {
        return ReservationSeatNo;
    }

    /**
     * gets capacity of restaurant
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * sets reservation id
     * @param reservationId (Int reservation ID)
     */
    public void setReservationId(int reservationId) {
        ReservationId = reservationId;
    }
}