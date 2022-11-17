import java.util.ArrayList;

public class Reservation{
    private int ReservationId = 0;
    private String ReservationName ="";
    private int ReservationSeatNo =0;
    private int ReservationPhoneNo = 0;
    
    public Reservation( String ReservationName,int ReservationSeatNo,int ReservationPhoneNo){
       ReservationId++;
        this.ReservationName = ReservationName;
        this.ReservationSeatNo = ReservationSeatNo;
        this.ReservationPhoneNo = ReservationPhoneNo;


    }

    ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    public void AddReservation(Reservation r){
        reservations.add(r);
    }

    public void CancelReservation(Reservation r){
         reservations.remove(r);
    }
}