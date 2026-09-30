class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;

        int s = nums.length;

        int[] pref = new int[s];
        int[] ans = new int[s];

        pref[0] = 1;

        for(int i=1; i<s; i++) {
            pref[i] = nums[i-1]*pref[i-1];
        }
        int postf = 1;
        for(int i=s-1; i>=0; i--){
            ans[i] = pref[i]*postf;
            postf = postf*nums[i];
        }

        return ans;
    }
}  
