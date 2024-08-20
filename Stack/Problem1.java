package Stack;

import java.util.Stack;

public class Problem1 {
    
    public static void main(String[] args) {
        // Problem 1 : Push at the bottom of the stack
        // Brute force - creating a new stack
        // Reccursive Approach (Used a lot in Stack Questions)
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        insertAtBottom(st,4);
        System.out.println(st);

    }
    public static Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        if(st.isEmpty()){
            st.push(x);
        }else{
            int val = st.pop();
            insertAtBottom(st , x);
            st.push(val);
        }
    
        return st;
    }
}
