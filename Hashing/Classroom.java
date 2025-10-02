package Hashing;

import java.util.HashMap;

public class Classroom {
    public static void main(String[] args) {
        // Create
        HashMap<String , Integer> map = new HashMap<>();

        //Insert 
        map.put("India", 30);
        map.put("China", 50);
        map.put("US", 70);
 
        // Get
        System.out.println(map.get("India"));

        // Contains key 
        System.out.println(map.containsKey( "UK"));
        System.out.println(map.containsKey("India"));

        // Remove 
        System.out.println(map.remove("China"));
        
    }
}
