package JavaDSAPlayground.Recursion;


public class Problem13 {
    public static void main(String[] args) {
        //Problem 13 : Friends Pairing Problem (GOLDMAN SACHS)
        // Given n friends , each one can remain single or can be paired up with some other friend. each friend can be paired only once.Find out the total no of ways in which friends can remain single or can be paired up.
        // Concept of Fibonachi series.
        int ans = friends(3);
        System.out.println(ans);
    }
    public static int friends(int n){
//         base case
        if(n<=2){
            return n;
        }
//        single
//        int single = friends(n-1);
//        pair
//        int pair = (n-1)*friends(n-2);
//        return single+pair;

        return friends(n-1) + (n-1)*friends(n-2);


    }
}
