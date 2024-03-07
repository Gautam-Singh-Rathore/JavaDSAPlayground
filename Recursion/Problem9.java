package JavaDSAPlayground.Recursion;


public class Problem9 {
    public static void main(String[] args) {
        // Problem 9 : Print x^n
        int x=200;
        int n=10;
        int ans = power(x,n);
        System.out.println(ans);
    }

    public static int power(int x , int n){
        if(n==0){
            return 1;
        }

        return x * power(x,n-1);
    }
}

