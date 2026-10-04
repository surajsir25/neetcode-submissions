class Solution {
    public int maxArea(int[] heights) {
        int maxA = 0;
        int l = 0, r = heights.length - 1;
        while(l<r) {
            maxA = Math.max(maxA, Math.min(heights[l], heights[r])*(r-l));
            if(heights[l]<heights[r]){
                l++;
            } else {
                r--;
            }
        }
        return maxA;
    }
}
