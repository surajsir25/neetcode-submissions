class Solution {
    public int maxProfit(int[] prices) {
        //USING PRIFIX TO STORE MINIMUM PRICE AT EACH POINT
        // int[] minA = new int[prices.length];
        // minA[0] = prices[0]; 
        // for(int i=1; i<prices.length; i++) {
        //     minA[i] = Math.min(minA[i-1], prices[i]);
        // }
        // int maxP = 0;

        // for(int i = 1; i<prices.length; i++){
        //     maxP = Math.max(maxP, prices[i]-minA[i-1]);
        // }
        // return maxP;

        // SIMPLE TWO POINTER APPROACH

        int l = 0;
        int maxP = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[l]>prices[i]){
                l=i;
            } else {
                maxP = Math.max(maxP, prices[i]-prices[l]);
            }
        }
        return maxP;
    }
}
