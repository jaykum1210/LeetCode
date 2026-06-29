class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for(int e : prices){
            if(e<min) min = e;
            int total = e-min;
            if(total>profit) profit = total;
        }
        return profit;
    }
}