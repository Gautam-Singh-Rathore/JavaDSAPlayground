package JavaDSAPlayground.Stack;

import java.util.Stack;

public class Problem3 {

    public static void main(String[] args) {
        // Problem 3 :  Reverse a Stack
        // 1. Brute force approach - making another stack and using extra memory
        // 2. Reccursive approach (Used in a lot of Stack Questions)
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        reverse(s);
        System.out.println(s);
    }
    static void reverse(Stack<Integer> s)
    {
        int val = s.pop();
        if(s.isEmpty()){
            s.push(val);
        }else{
            reverse(s);
            pushAtBottom(s,val);
        }
        
    }
    public static void pushAtBottom(Stack<Integer> s , int x){
        if(s.isEmpty()){
            s.push(x);
        }else{
            int val = s.pop();
            pushAtBottom(s,x);
            s.push(val);
        }
    }
}
