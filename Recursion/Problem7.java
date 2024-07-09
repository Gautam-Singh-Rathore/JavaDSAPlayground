package Recursion;


public class Problem7 {
    public static void main(String[] args) {
        // Problem 7 : WAF to find the first occurence of an element in an array
        int [] arr = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        int ans = findFirst(arr , key , 0);
        System.out.println(ans);
    }
    public static int findFirst(int [] arr , int key, int i){
        if(i==arr.length  )
        {
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

        return findFirst(arr , key , i+1);
    }
}
