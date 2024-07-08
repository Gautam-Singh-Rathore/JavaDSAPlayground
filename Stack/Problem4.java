package JavaDSAPlayground.Stack;
import java.util.Stack;

public class Problem4 {
    public static void main(String[] args) {
        // Problem 4 : STOCK-SPAN PROBLEM
        // ** IMPORTANT QUESTION **
        // Span = max no. of consecutive days for which - price <= today's price
        // span = i - prevHigh
        // we will make stack for indices of previous highs
        
        int stocks[] = {100 , 80 , 60 , 70 , 60 , 85 , 100};
        int span[] = new int[stocks.length];
        stockSpan(stocks , span);
        for(int i=0 ; i<span.length ; i++){
            System.out.println(span[i]+" ");
        }

    }
    public static void stockSpan(int[] stocks , int[] span ){

        Stack<Integer> s = new Stack<>();
        span[0]=1;
        s.push(0);

        for(int i=0 ; i<span.length ; i++){
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice >= stocks[s.peek()] ){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;

            }else{
                span[i] = i - s.peek();
            }
            s.push(i);
            
        }
        
    }
    
}
