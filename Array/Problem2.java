package Array;

public class Problem2 {
    public static void main(String[] args) {
        //Problem 2 : Reverse an array
        // If we copy in new array - TC=o(n) and SC=O(n)
        int arr[] = {2,4,6,8,10};
        print(arr);
        revArr(arr);

    }
    public static void revArr(int arr[]){
        int s = 0;
        int e = arr.length-1;

        while(e>s){
            int temp = arr[e];
            arr[e]=arr[s];
            arr[s]=temp;
            s++;
            e--;
        }
        print(arr);
    }
    public static void print(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
