package Searching;

public class LinearSearch {
    //Linear search function
    public static int linearSearch(int arr[] ,int  key){
        for (int i=0 ; i<arr.length ; i++){
            if(arr[i] == key)
                return i;
        }
        return -1;
    }

    // Main method
    public static void main(String[] args) {
        // Q. find the index of element in a given array.
        // Time Complexity = o(n)
        int nums[] = {2,4,6,8,10,12,14,16};
        int key = 20;
        int ans = linearSearch(nums , key);
        if (ans==-1){
            System.out.println("Key not present in the array");
        }else {
            System.out.println("The index of key is : " + ans);
        }
    }
}
