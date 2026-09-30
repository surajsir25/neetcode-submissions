class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Boolean> hm = new HashMap<>();
        for(int num : nums) {
            if(hm.containsKey(num)){
                return true;
            }
            else {
                hm.put(num, true);
            }
        }
        return false;
    }
}