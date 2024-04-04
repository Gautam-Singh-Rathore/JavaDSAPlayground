package JavaDSAPlayground.Array;

public class Problem3 {
    public static void main(String[] args) {
        //problem 3 : Pairs in an array
        int arr[] = {2,4,6,8,10};
        printPairs(arr);
        //Time Complexity : O(N^2)
    }
    public static void printPairs(int arr[]){
        int count = 0;
        for(int i=0 ; i<arr.length-1 ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs are : "+count);
    }
}
