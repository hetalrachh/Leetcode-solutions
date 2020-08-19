class Solution {
    public int maxProfit(int[] prices) {
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i=0; i<prices.length; i++) {
            //find the minPrice (smallest valley,min buy price) 
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            } else if(prices[i] - minPrice > maxProfit) {
                //if the profit is greater than maxProfit (selling-buying) price
                maxProfit = prices[i] - minPrice;
            } 
        }
        
        return maxProfit;
        
    }
}

//Time complexity  = O(n)
//Space complexity = O(1)