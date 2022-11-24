import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class Reservation {
    private int ReservationId = 0;
    private String ReservationName = "";
    private int ReservationSeatNo = 0;
    private int ReservationPhoneNo = 0;
    private String time;
    private int capacity;
    ArrayList<Reservation> reservations = new ArrayList<Reservation>();
    ArrayList<Table> reservedTables = new ArrayList<Table>();

    public Reservation(Restaurant r, String ReservationName, int ReservationSeatNo, int capacity, int ReservationPhoneNo, String time) {
        ReservationId++;
        this.ReservationName = ReservationName;
        this.ReservationSeatNo = ReservationSeatNo;
        this.ReservationPhoneNo = ReservationPhoneNo;
        this.time = time;
        this.capacity = capacity;
        reservations.add(new Reservation(r, "ReservationName", ReservationSeatNo, capacity, ReservationPhoneNo, "time"));
        Table t = new Table(ReservationSeatNo, capacity);
        r.removeTable(t);
    }

    public ArrayList<Table> getReservedTables() {
    	return reservedTables;
    }

    public void CancelReservation(Reservation r) {
        reservations.remove(r);
    }
    
    public String toString(){
        String result = "";
        result += "ReservationName: " + ReservationName + "\n";
        result += "ReservationSeatNo: " + ReservationSeatNo +"\n";
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
}