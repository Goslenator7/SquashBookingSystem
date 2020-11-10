import java.util.HashMap;

public class Week {

    private HashMap<String, HashMap<String, HashMap<Double, String>>> aWeek = new HashMap<>();


    // Getters and setters
    public HashMap<String, HashMap<String, HashMap<Double, String>>> getAWeek() {
        return aWeek;
    }

    public void setAWeek(HashMap<String, HashMap<String, HashMap<Double, String>>> aWeek) {
        this.aWeek = aWeek;
    }
}
