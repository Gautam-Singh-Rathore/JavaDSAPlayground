package JavaDSAPlayground.Array;

public class Problem6 {
    public static void printSubArray(int[] arr){
        int count=0;
        for(int i = 0 ; i<arr.length ; i++){
            for(int j=i ; j<arr.length ; j++){
                System.out.print("( ");
                for(int k =i ; k<=j ; k++ ){
                    System.out.print(arr[k]+" ");

                }
                count++;
                System.out.println(")  ");
            }
            System.out.println();
        }
        System.out.println("Total Subarray equals : "+count);
    }
    public static void main(String[] args) {
        //Problem 6 : Print subarray
        // Time Complexity : O(n^3)
        int arr[] = {2,4,6,8,10};
        printSubArray(arr);
    }
}
