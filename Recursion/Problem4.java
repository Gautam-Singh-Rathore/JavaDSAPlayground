package JavaDSAPlayground.Recursion;


public class Problem4 {
    public static void main(String[] args) {
        // Print sum of n natural numbers using reccurssion
        int n=10;
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}

