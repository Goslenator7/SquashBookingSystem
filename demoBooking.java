import javax.swing.*;
import java.util.HashMap;

public class demoBooking {
    public static void main(String[] args) {

        Week week1 = new Week();

        Day monday = new Day();
        Day tuesday = new Day();
        Day wednesday = new Day();
        Day thursday = new Day();
        Day friday = new Day();
        Day saturday = new Day();
        Day sunday = new Day();

        Court court1 = new Court();
        Court court2 = new Court();
        Court court3 = new Court();
        Court court4 = new Court();
        Court court5 = new Court();

        HashMap<String, Day> daysOfWeek = new HashMap<String, Day>();
        daysOfWeek.put("Monday", monday);
        daysOfWeek.put("Tuesday", tuesday);
        daysOfWeek.put("Wednesday", wednesday);
        daysOfWeek.put("Thursday", thursday);
        daysOfWeek.put("Friday", friday);
        daysOfWeek.put("Saturday", saturday);
        daysOfWeek.put("Sunday", sunday);

        HashMap<String, Court> courtsOnDay = new HashMap<>();
        courtsOnDay.put("Court 1", court1);
        courtsOnDay.put("Court 2", court2);
        courtsOnDay.put("Court 3", court3);
        courtsOnDay.put("Court 4", court4);
        courtsOnDay.put("Court 5", court5);


        //court2.bookCourt();
        //court1.bookCourt();

        court1.cancelBooking();

    }
}
