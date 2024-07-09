package Recursion;


public class Problem10 {
    public static void main(String[] args) {
        // Problem 10 : Print x^n in O(logn)
        int ans  = power(2,5);
        System.out.println(ans);

    }
    public static int power(int n , int p){
        if(p==1){
            return n;
        }
        int halfPower = power(n, p/ 2);
        // Odd power
        if (p%2==1) {
            return n * halfPower * halfPower ;
        }

        // Even power
        return halfPower*halfPower;

    }
}
