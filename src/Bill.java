
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Bill {



    private LocalDateTime date; //represents current date and time

    private double tip;
    private double amount;
    private double balance;
    private String description;
    private File filesOrders = new File("billfororder.csv");
    private PrintWriter out = new PrintWriter(filesOrders);

    /**

     @param date (Local date time)
     @param tip (double tip received)
     @param amount (double amount of bill)
     @param balance (double balance in bill)
     @param description (String Description of bill)

     */
    public Bill(LocalDateTime date, double tip, double amount, double balance, String description) throws FileNotFoundException {
        this.date = LocalDateTime.now();
        this.tip = tip;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    //Initializing objects of class bill but leaves out tip as it doesn't always occur and throwing except for file not found
    public Bill(LocalDateTime date,double amount,double balance,String description) throws FileNotFoundException {
        this.date = LocalDateTime.now();
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    /**
     * toString method
     * @return resulted string
     */
    public String toString(){
        String result = "";
        result += "Date: " + date + "\n";
        result += "Tip: " + tip +"\n";
        result += "Amount: " + amount + "\n";
        result += "Balance: " + balance + "\n";
        result += "Description: " + description + "\n";
        return result;
    }

    public static void main(String[] args) throws FileNotFoundException{

        Bill Order1 = new Bill(LocalDateTime.now(),10,100,150,"MainCourse");
        Bill Order2 = new Bill(LocalDateTime.now(),35,450,"Desserts");
        ArrayList<Bill>billorder = new ArrayList<Bill>(); //creates arraylist of bill
        File csvFile = new File("billfororder.csv");//creates cvsfile object
        PrintWriter outer = new PrintWriter(csvFile);

        billorder.add(Order1);
        billorder.add(Order2);

        /**
         * creates csv file
         * prints data to csv
         */
        for
        (Bill b: billorder)
        {
            outer.println(b.toString());
            outer.close();

        }

    }
        
