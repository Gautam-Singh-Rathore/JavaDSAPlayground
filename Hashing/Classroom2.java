package Hashing;

import java.util.HashMap;
import java.util.Set;

public class Classroom2 {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("India", 20);
        map.put("US", 30);
        map.put("UK", 40);
        map.put("China", 50);
        map.put("India", 60);

        Set<String> keys = map.keySet();
        for(String k : keys){
            System.out.println(k+" : "+map.get(k));
        }
    }
}
