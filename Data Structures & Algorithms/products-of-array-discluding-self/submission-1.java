class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        int[] pref = new int[nums.length];
        pref[0] = 1;
        for(int i = 1; i<nums.length; i++){
            pref[i] = pref[i-1]*nums[i-1];
        }

        int[] postf = new int[nums.length];
        postf[nums.length -1] = 1;
        for(int i = nums.length-1; i>0; i--) {
            ans[i] = postf[i]*pref[i];
            postf[i-1]= nums[i] * postf[i];
        }
        ans[0] = postf[0]*pref[0];
        return ans;
    }
}  
