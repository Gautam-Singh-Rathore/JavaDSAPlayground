package JavaDSAPlayground.Array;

public class Problem7_1 {
    public static void main(String[] args) {
        //Problem 7.1 : Max Subarray Sum
        //Time Complexity : O(n^3)
        //**BRUTE FORCE APPROACH**
        int[] arr = {1,-2 , 6 , -1 , 3};
        maxSum(arr);
    }
    public static void maxSum(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length ; i++){
            for(int j=i ; j<arr.length ; j++){
                int currSum = 0;
                for(int k =i ; k<=j ; k++ ){
                    currSum = arr[k]+currSum;

                }
                max = Math.max(max , currSum);
            }

        }
        System.out.println("Maximum subarray sum is : "+max);
    }
}
