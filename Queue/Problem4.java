package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Problem4 {
    public static void main(String[] args) {
        // Problem 4 : Interleave 2 Halves of a Queue (even lenght)

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }
        System.out.println();
    }

    public static void interLeave(Queue<Integer> q){

        Queue<Integer> half = new LinkedList<>();
        int size = q.size();
        for(int i=0 ; i<size/2 ; i++){
            half.add(q.remove());
        }

        while (!half.isEmpty()) {
            q.add(half.remove());
            q.add(q.remove());
            
        }
    }
    
}
