package Hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Classroom3 {
    public static void main(String[] args) {
        // LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>();
        // lhm.put("India", 100);
        // lhm.put("China", 500);
        // lhm.put("US", 300);
        // System.out.println("Linked Hash Map :" + lhm);

        TreeMap<String , Integer> lhm = new TreeMap<>();
        lhm.put("India", 100);
        lhm.put("China", 500);
        lhm.put("US", 300);
        System.out.println("Tree Map :" + lhm);

        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 500);
        hm.put("US", 300);
        System.out.println("Hash Map :" + hm);
    }
}
