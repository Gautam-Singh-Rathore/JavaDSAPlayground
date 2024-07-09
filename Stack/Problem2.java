package Stack;

import java.util.Stack;

public class Problem2 {

    public static void main(String[] args) {
        //Problem 2 : Reverse a String using a Stack
        String input = "ABC";
        System.out.println(input);
        String output = reverse(input);
        System.out.println(output);

    }

    public static String reverse(String S){
        
        Stack<Character> stack = new Stack<Character>();
        for(int i=0 ; i<S.length() ; i++){
            stack.push(S.charAt(i));
        }
        String ans = "";
        while(!stack.isEmpty()){
            char val = stack.pop();
            ans=ans+val;
        }
        
        
        return ans;
    }
    
}
