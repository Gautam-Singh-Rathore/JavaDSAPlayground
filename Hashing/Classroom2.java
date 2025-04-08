package Hashing;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Classroom2 {
    public static void main(String[] args) {
        // LinkedHashMap -> order is
        LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);
        lhm.put("Nepal", 5);

        System.out.println("Linked hash map : "); // Linked hash map usese doubly linked list internally in place of singly linked list
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
