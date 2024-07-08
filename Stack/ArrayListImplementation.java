package JavaDSAPlayground.Stack;

import java.util.ArrayList;

public class ArrayListImplementation {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty(){
            return list.size()==0;
        }
        // Push function
        public void push(int data){
            list.add(data);
        }
        // Pop function
        public int pop(){
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        } 
        // Peek function
        public int peek(){
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
