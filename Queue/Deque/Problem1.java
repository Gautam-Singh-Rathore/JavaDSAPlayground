package Queue.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class Problem1 {
    public static void main(String[] args) {
        // Question : Stack using Deque
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }

    
    static class Stack{
        Deque<Integer> deque = new LinkedList<>();
        
        public void push(int data){
            deque.addLast(data);
        }

        public int pop(){
           return  deque.removeLast();
        } 

        public int peek(){
            return deque.getLast();
        }

    }
}
