import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> peopleMap = new HashMap<>();

        peopleMap.put("Johnny", 10);
        peopleMap.put("Julie", 12);

        for (String key: peopleMap.keySet()) {
            System.out.println("Name: " + key + ", Age: " + peopleMap.get(key));
        }
    }
}
