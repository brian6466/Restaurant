import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Reservation {
    private int ReservationId = 0;
    private String ReservationName = "";
    private int ReservationSeatNo = 0;
    private int ReservationPhoneNo = 0;

    public Reservation(String ReservationName, int ReservationSeatNo, int ReservationPhoneNo) {
        ReservationId++;
        this.ReservationName = ReservationName;
        this.ReservationSeatNo = ReservationSeatNo;
        this.ReservationPhoneNo = ReservationPhoneNo;

    }

    ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    public void AddReservation(Reservation r) {
        reservations.add(r);
    }

    public void CancelReservation(Reservation r) {
        reservations.remove(r);
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Reservation> reservations = new ArrayList<Reservation>();
        File csvFile = new File("reservation.csv");
        PrintWriter out = new PrintWriter(csvFile);

        for (Reservation reservation : reservations) {
            out.println(reservations);

        }
        out.close();

    }
}