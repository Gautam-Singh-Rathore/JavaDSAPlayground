package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Problem5 {
    public static void main(String[] args) {
        // Problem 5 : Queue Reversal

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        queueReversal(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }

    public static void queueReversal(Queue<Integer> q){
        Stack<Integer> stk = new Stack<>();
        while (!q.isEmpty()) {
            stk.push(q.remove());
        }

        while (!stk.isEmpty()) {
            q.add(stk.pop());
            
        }
    }
    
}
