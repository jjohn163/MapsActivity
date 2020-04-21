import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> peopleMap = new HashMap<>();

        peopleMap.put("Johnny", 10);
        peopleMap.put("Julie", 12);

        for (String key: peopleMap.keySet()) {
            System.out.println("Name: " + key + ", Age: " + peopleMap.get(key)); //Activity 1
            //System.out.println("Name: " + key + ", Friends: " + peopleMap.get(key)); // Activity 2
            //System.out.println(key + ", Friends: " + peopleMap.get(key)); //Activity 3
        }

        /*
        Map<Person, List<String>> exampleMap = new HashMap<>();
        exampleMap.put(new Person("Johnny", 10), new ArrayList<>(Arrays.asList("Billy", "Bobby")));
        exampleMap.put(new Person("Julie", 10), new ArrayList<>(Arrays.asList("Bobby")));
        exampleMap.put(new Person("Joe", 10), null);
        displayPeopleMap(exampleMap);
        */
    }
    //Example of using map as a parameter
    public static void displayPeopleMap(Map<Person, List<String>> map){
        for (Person key: map.keySet()) {
            if (map.get(key) != null) {
                System.out.println(key + ", Friends: " + map.get(key));
            }
            else{
                System.out.println(key + ", NO FRIENDS LISTED.");
            }
        }
    }

    //HOMEWORK:
    public static List<Person> getOlderFriends(Person person, Map<Person, List<Person>> map){
        return null;
    }
}
