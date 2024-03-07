package JavaDSAPlayground.Recursion;

class Problem3 {
    public static void main(String[]args){
        //Problem-3:Print Factorial of a number n.
        int n=5;
        System.out.println(fact(n));
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
