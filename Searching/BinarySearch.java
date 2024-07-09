package Searching;

public class BinarySearch {
    //BINARY SEARCH FUNCTION (**ITERATIVE APPROACH**)
    public static int binarySearch(int arr[] , int key){
        int start = 0 ;
        int end = arr.length-1;
        while(end >= start){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(key>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    // MAIN FUNCTION
    public static void main(String[] args) {
        // Time Complexity : O(logn)
        //prerequisite - sorted array
        /* Pseudo - code
        start=0 , end=n-1
        while(start<=end)
            find mid
            compare mid and key
                mid==key FOUND
                mid>key  LEFT
                mid<key  RIGHT */
        int arr[] = {2,4,6,8,10,12,14};
        int key = 10;
        int ans = binarySearch(arr , key);
        if (ans == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println(
                    "Element is present at index " + ans);
    }
}

