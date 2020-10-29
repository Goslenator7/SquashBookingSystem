import javax.swing.*;
import java.util.HashMap;

public class Court {

    private HashMap<String, String> aCourt = new HashMap<>();

    // Get the time the user is booking for and check if there is already a booking
    public void bookCourt() {
        String time;
        time = JOptionPane.showInputDialog(null, "Please enter a time (hh:mm) you would like to book for: ");
        checkIfAlreadyBooked(time);
    }

    // If the time already has a booking, ask them to pick a different time
    public void checkIfAlreadyBooked(String time) {
        String alreadyBooked = "Sorry, this time already has a booking. Please pick a different time.";
        if (aCourt.containsKey(time)) {
            JOptionPane.showMessageDialog(null, alreadyBooked, "Already booked", JOptionPane.WARNING_MESSAGE);
            bookCourt();
        }
        // If there isn't already a booking, get a name for their booking and add it to the schedule
        else {
            String name;
            name = JOptionPane.showInputDialog(null, "Please enter a name for the booking: ");
            aCourt.put(time, name);
        }
    }

    // Cancel a booking based on the time you booked for
    public void cancelBooking() {
        String time;

        time = JOptionPane.showInputDialog("What time was your booking for?");
        String cancelConfirm = "Your booking for "+time+" under name "+aCourt.get(time)+" has been cancelled";

        aCourt.remove(time);

        JOptionPane.showMessageDialog(null, cancelConfirm, "Booking Cancelled", JOptionPane.INFORMATION_MESSAGE);
    }


    // Getters and setters

    public HashMap<String, String> getaCourt() {
        return aCourt;
    }

    public void setaCourt(HashMap<String, String> aCourt) {
        this.aCourt = aCourt;
    }

}
