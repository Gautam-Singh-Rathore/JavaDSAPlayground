package Recursion;


public class Problem6 {
    public static void main(String[] args) {
        // Problem 6 : Check if the array is sorted or not.(scending order)
        int[] arr = {3, 4 , 1, 2, 5};
        if (sort(arr , 0)) {
            System.out.println("SORTED");
        } else {
            System.out.println("NOT SORTED");
        }
    }
    public static boolean sort(int [] arr , int i){
        if(i==arr.length -1){
            return true;
        }

        if (arr[i] > arr[i+1]){
            return false;
        }

        return sort(arr , i+1);
    }

}

