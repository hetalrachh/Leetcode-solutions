class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length == 0) {
            return 0;
        }
        
        int maxProfit = 0;
        int peak = prices[0];
        int valley = prices[0];
        
        for(int i=0; i< prices.length - 1; i++) {
            //check if the price at i is a valley and at i+1 is a peak (valley < peak)
            if(prices[i] <= prices[i+1]) {
                valley = prices[i];
                peak = prices[i+1];
                maxProfit = maxProfit + (peak-valley);
            }
        }
        
        return maxProfit;
        
    }
}

//Time complexity = O(n)
//Space complexity = O(1)