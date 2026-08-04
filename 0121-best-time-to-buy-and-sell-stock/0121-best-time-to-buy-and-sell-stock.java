class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int e : prices){
            if(e<min) min = e;
            int total = e - min;
            profit = Math.max(profit,total);
        }
        return profit;
    }
}