package Recursion;

class Problem1_2 {
    public static void main(String[] args) {
        // When a function calls itself then it is known as Reccurssion.
        // Recurssion is a method of solving a computational problem where the solution depends on solutions to SMALLER INSTANCES OF THE SAME PROBLEM.
        // Two directions.(Towards base case) and (Away from the base case)
        //Step-1 :Base Case
        //Step-2: Kaam (Work)
        //Step-3:Inner Call
        //Problem-1: Print numbers from 1 to 10 (Decreasing Order)
        int n = 10;
        printInc(n);
//        printDec(10);
    }

    // INCREASING ORDER
    public static void printInc(int n) {
    if(n==1){
    System.out.print(n+" ");
    return;
    }
    printInc(n-1);
    System.out.print(n+" ");
    }
    // DECREASING ORDER
    public static void printDec(int n){
        if (n==1){
            System.out.print(n);
            return ;
        }
        System.out.print(n);
        printDec(n-1);
    }

}