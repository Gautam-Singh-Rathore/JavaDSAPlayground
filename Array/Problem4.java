package Array;

public class Problem4 {
    public static int stocks(int [] prices){
        int max = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=1 ; i<prices.length ; i++){
            buyPrice = Integer.min(buyPrice , prices[i-1]);
            max = Integer.max(max , prices[i]-buyPrice);
        }
        return max;
    }
    public static void main(String[] args) {
        //Problem 4 : Best time to buy and sell stock
        //The cost of a stock on each day is given in an array. Find the maximum profit that you can make by buying and selling on those days. If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.
        int prices[] = {7,1,5,3,6,4};
        int ans = stocks(prices);
        System.out.println("Max profit is : "+ans);
    }
}
