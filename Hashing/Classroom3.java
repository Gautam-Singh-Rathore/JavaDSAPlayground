package Hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Classroom3 {
    public static void main(String[] args) {
        // Tree maps -> keys are sorted
        TreeMap<String , Integer> lhm = new TreeMap();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);
        lhm.put("Nepal", 5);

        System.out.println(" Tree map : "); // Tree hash map does not usese arrays or linkedlists internally but usese red black tyrees which are self balacing so put,remove,get operations are O(logN)
        System.out.println(lhm);

        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        System.out.println("Hash map : ");
        System.out.println(hm);
    }
    
}
