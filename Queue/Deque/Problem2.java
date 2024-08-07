package Queue.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class Problem2 {
    public static void main(String[] args) {
        // Question : Queue using Deque
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

    }

    static class Queue {
        Deque<Integer> d = new LinkedList<>();

        public void add(int data){
            d.addLast(data);
        }

        public int remove(){
            return d.removeFirst();
        } 

        public int peek(){
            return d.getFirst();
        }
        
    }
}
