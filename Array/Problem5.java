package Array;

public class Problem5 {
    public static int trappedWater(int[] arr){
        int n = arr.length;
        //left max boundary
        int[] leftMax = new int[arr.length];
        leftMax[0] = arr[0];
        for(int i=1 ; i<leftMax.length ; i++){
            leftMax[i] = Integer.max(leftMax[i-1],arr[i] );
        }
        //right max boundary
        int[] rightMax = new int[arr.length];
        rightMax[n-1] = arr[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            rightMax[i] = Integer.max(rightMax[i+1],arr[i] );
        }
        // Calculating water level
        int sum = 0;
        for(int i=0 ; i<n ; i++){
            int waterLevel = Integer.min(leftMax[i],rightMax[i] );
            sum = sum + (waterLevel - arr[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        //Problem 5 : Trapping Rainwater
        // New concept : Auxiliary Arrays
        int[] height = {4,2,0,6,3,2,5};
        int ans = trappedWater(height);
        System.out.println("The trapped rainwater is : "+ans);
    }
}
