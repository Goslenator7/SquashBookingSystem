import java.util.HashMap;

public class Week {

    private HashMap<String, Day> daysOfWeek = new HashMap<>();


    // Getters and setters

    public HashMap<String, Day> getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(HashMap<String, Day> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }
}
