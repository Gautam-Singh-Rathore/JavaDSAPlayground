package Hashing;

import java.util.HashMap;
import java.util.Set;

public class Classroom1 {
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        Set<String> keys = hm.keySet();
        // hm.entrySet() -> to get all the values from the key value pairs
        System.out.println(keys);
        for(String key : keys){
            System.out.println(hm.get(key));
        }
    }
    
}
