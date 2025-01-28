package Heaps;
import java.util.*;

public class HeapSort {
    public static void heapify(int i , int n , int[] arr){
        int left = 2*i+1;
        int right = 2*i+2;
        int max = i;

        if(left<n && arr[i]<arr[left]){
            max=left;
        }
        if(right<n && arr[i]<arr[right]){
            max=right;
        }

        if(max!=i){
            //swap
            int temp = arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
            heapify(max , n , arr);
        }
    }
    public static void heapSort(int arr[]){
        int n = arr.length;
        //step1-> build maxheap
        for(int i=n/2 ;i>=0 ; i--){
            heapify(i , n , arr);
        }
        // step2-> push largest at end
        for(int i=n-1 ; i>0 ; i--){
            //swap largest with last 
            int temp = arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(0,i , arr);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,5};
        heapSort(arr);
        for(int a : arr){
            System.out.println(a);
        }
    }
    
}

