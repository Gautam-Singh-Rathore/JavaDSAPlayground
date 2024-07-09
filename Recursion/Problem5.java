package Recursion;


public class Problem5 {
    public static void main(String[] args){
    // Problem 5 : Find nth term of a fibonachi series
        int n = 25;
        System.out.println(nth_num(n));
    }
    public static int nth_num(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return nth_num(n-1) + nth_num(n-2);
    }
}

