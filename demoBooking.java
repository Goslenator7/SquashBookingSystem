import javax.swing.*;
import java.util.HashMap;

public class demoBooking {
    public static void main(String[] args) {

        // Make hashmap for court
        HashMap<Double, String> court1 = new HashMap<>();

        // Make hashmap for day
        HashMap<String, HashMap<Double, String>> monday = new HashMap<>();

        // Make hash map for week
        HashMap<String, HashMap<String,HashMap<Double, String>>> week1 = new HashMap<>();

        // Book a court for a time
        court1.put(9.00, "Jeffries");
        court1.put(9.30, "Carsons");

        // Add the court bookings to a day
        monday.put("Monday", court1);

        // Add the day with associated bookings to week
        week1.put("Week 1", monday);

        // Display all the bookings for a court on a day
        for (String week : week1.keySet()) {
            String bookings = "Day: "+week1.get("Week 1")+"\nCourts: "+week1.get("Monday")+"\nBookings: "+court1.get(9.00)+court1.get(9.30);
            JOptionPane.showMessageDialog(null, "bookings");
        }
    }
}
