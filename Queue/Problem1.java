package Queue;

import java.util.Stack;

public class Problem1{
    public static void main(String[] args) {
    // Problem 1: Queue using 2 Stacks
 
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);

    while (!q.isEmpty()) {
        System.out.println(q.remove());
    }

    
    }

    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // isEmpty
        public boolean isEmpty(){
            return s1.isEmpty();
        }

        // Add
        public void add (int data){
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        // Remove
        public int remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty ..");
                return Integer.MIN_VALUE;
            }

            return s1.pop();
        }
        
        // Peek
        public int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty ..");
                return Integer.MIN_VALUE;
            }

            return s1.peek();
        }
    }

}