package JavaDSAPlayground.Array;

public class Problem7_2 {
    public static void main(String[] args) {
        //Problem 7.2 : Max Subarray Sum
        //Time Complexity : O(n^2)
        //**PREFIX SUM APPROACH**
        int[] arr = {1,-2 , 6 , -1 , 3};
        maxSum(arr);
    }

    public static void maxSum(int arr[]) {
        //Making prefix sum array
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        //Calculating maximum subarray sum
        //prefix[end] - pefix[start-1]
        int max=Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length ; i++){
            for(int j=i ; j<arr.length ; j++){
                max = i==0 ? prefix[j] :Math.max(max , prefix[j]-prefix[i-1]);
                }

            }
        System.out.println("Maximum subarray sum is : "+max);
        }

    }

