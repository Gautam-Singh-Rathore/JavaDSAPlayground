package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Classroom4 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Delhi");
        hs.add("Jaipur");
        hs.add("Mumbai");
        hs.add("Hyderabad");
        hs.add("Kollata");

        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for(String city : hs){
            System.out.println(city);
        }

    }
}
