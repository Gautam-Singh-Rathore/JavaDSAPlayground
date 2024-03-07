package JavaDSAPlayground.Recursion;


public class Problem8 {
    public static void main(String[] args) {
        // Problem 8 : WAF to find the LAST occurence of an element in an array
        int [] arr = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        int ans = findLast(arr , key , arr.length-1);
        System.out.println(ans);
    }
    public static int findLast(int [] arr , int key, int i){
        if(i<0 )
        {
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

        return findLast(arr , key , i-1);
    }
}

