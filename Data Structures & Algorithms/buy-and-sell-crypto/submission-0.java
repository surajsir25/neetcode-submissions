class Solution {
    public int maxProfit(int[] prices) {
        int[] minA = new int[prices.length];
        minA[0] = prices[0]; 
        for(int i=1; i<prices.length; i++) {
            minA[i] = Math.min(minA[i-1], prices[i]);
        }
        int maxP = 0;

        for(int i = 1; i<prices.length; i++){
            maxP = Math.max(maxP, prices[i]-minA[i-1]);
        }
        return maxP;
    }
}
