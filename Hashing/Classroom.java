package Hashing;
import java.util.HashMap;
public class Classroom{
    public static void main(String[] args) {
        // Create
        HashMap<String , Integer> hm = new HashMap<>();
        // Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);

        System.out.println(hm);

        //Get
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Bhutan"));

        //conatinsKey
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Nepa"));

        // Remove
        System.out.println(hm.remove("India"));
        System.out.println(hm);
        
        // Size
        System.out.println(hm.size());

        // isEmpty
        System.out.println(hm.isEmpty());
        
        // clear
        hm.clear();
        System.out.println(hm.isEmpty());
        
    }

}