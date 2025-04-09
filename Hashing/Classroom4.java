package Hashing;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Classroom4 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(1);
        set.add(2);

        /*
        System.out.println(set);
        // set.remove(2);
        if(set.contains(2)){
            System.out.println("Set contains 2");
        }else{
            System.out.println("Set does not conatins 2");
        }

        System.out.println(set.size());
        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        */

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
    
}
