import java.util.TreeMap;

public class BookingSystem {

    // Create TreeMap of Week, Day and Court
    TreeMap<String, TreeMap<String, TreeMap<String, String>>> bookingSystem = new TreeMap<>();

    // Constructor
    public BookingSystem() {
        this.bookingSystem = returnWeekMap();
    }

    // Create a map for times and bookings with names as null by default
    public TreeMap<String, String> returnBookingMap() {

        String[] times = {"09:00", "09:45", "10:30", "11:15", "12:00", "12:45", "13:30", "14:15"};

        TreeMap<String, String> booking = new TreeMap<>();

        // Loop through map and place null as booking name by default
        for(int x = 0; x < times.length; x++ ){
            booking.put(times[x], null);
        }

        System.out.println("Booking: " + booking);
        return booking;
    }

    // Create Courts map to each hold a booking map
    public TreeMap<String, TreeMap<String, String>> returnCourtsMap() {
        String[] courts = {"1", "2", "3", "4", "5"};

        TreeMap<String, TreeMap<String, String>> court = new TreeMap<>();

        // Associate a bookings map with each court
        for(int x = 0; x < courts.length; x++ ){
            court.put(courts[x], returnBookingMap());
        }

        System.out.println("courts: " + court);
        return court;
    }

    // Create a days map to hold courts each, which in turn hold bookings
    public TreeMap<String, TreeMap<String, TreeMap<String, String>>>  returnWeekMap() {

        String[] daysInWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        TreeMap<String, TreeMap<String, TreeMap<String, String>>> week = new TreeMap<>();

        // Associate a courts map (with booking map) with each day
        for(int x = 0; x < daysInWeek.length; x++){
            week.put(daysInWeek[x], returnCourtsMap());
        }

        System.out.println("week: " + week);
        return week;
    }

    // Make a booking for a time on a court on a day
    public void makeBooking(String day, String court, String time, String name) {

        String bookedName = this.bookingSystem.get(day).get(court).get(time);

        if(bookedName == null) {
            this.bookingSystem.get(day).get(court).put(time, name);
        } else {
            System.out.println("This time already has a booking. Please select another day, court or time.");
        }
    }
}
