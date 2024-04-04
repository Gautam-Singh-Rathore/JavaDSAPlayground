package JavaDSAPlayground.Array;

public class Problem1 {
    //MAX FUNCTION
    public static int getMax(int nums[] ){
        int max = Integer.MIN_VALUE ; // - infinity
        for (int i=0 ; i<nums.length ; i++){
//            if(nums[i]>max){
//                max=nums[i];
//            }
            max = Math.max(nums[i] , max);
        }
        return max;
    }
    //MIN FUNCTION
    public static int getMin(int nums[]){
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i<nums.length ; i++){
            min = Math.min(min ,nums[i]);
        }
        return min;
    }
    // MAIN FUNCTION
    public static void main(String[] args) {
    //Problem 1 : Find the largest number in a given array
    //Time Complexity : O(n)
        int nums[] = {1,2,6,3,5};
        int max = getMax(nums);
        int min = getMin(nums);

        System.out.println("Maxinum number is : "+max);
        System.out.println("Minimum number is : "+min);

    }
}
