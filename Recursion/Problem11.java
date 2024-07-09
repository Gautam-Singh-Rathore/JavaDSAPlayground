package Recursion;

public class Problem11 {
    public static void main(String[] args) {
        //Problem 11 : Tiling problem(AMAZON)
        //Given a "2*n" board and tile of size "2*1" , count the number of ways to tile the given board using 2*1 tiles
        //(A tile can either be placed horizontally or vertically )
        // Concept of Fibonachi series.
        System.out.println(count(0));

    }
    public static int count(int n){
        // base case
        if(n<=2){
            return n;
        }
        // kaam
        // vertical choice
        int vTile = count(n-1);
        // horizontal choice
        int hTile = count(n-2);
        return vTile + hTile;
    }
}

