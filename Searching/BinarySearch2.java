package Searching;

public class BinarySearch2 {
    //BINARY SEARCH FUNCTION (**RECURSSIVE APPROACH**)
    public static int binarySearch(int [] arr , int key , int start , int end){
        if(start <= end){
          int mid=(start+end)/2;
          if(arr[mid]==key){
              return mid;
          }else if(key>arr[mid]){
              return binarySearch(arr , key , mid+1 , end);
          }else{
              return binarySearch(arr , key , start , mid-1);
          }
        }
        return -1;
    }
    // MAIN FUNCTION
    public static void main(String[] args) {
    //prerequisite - sorted array
    int arr[] = {2,4,6,8,10,12,14};
    int key = 100;
    int ans = binarySearch(arr , key ,0 , arr.length -1);
        if (ans == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println(
                    "Element is present at index " + ans);
    }
}

