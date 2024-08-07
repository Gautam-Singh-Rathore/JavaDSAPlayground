package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class JCFQueue {

    public static void main(String[] args) {
        
        Queue<Integer> q1 = new LinkedList<>(); // ArrayDeque
        Queue<Integer> q = new ArrayDeque<>();
        // Queue is not a class but an interface in Java Collection Framework
        q.add(1);
        q.add(2);
        q.add(3);
         
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
