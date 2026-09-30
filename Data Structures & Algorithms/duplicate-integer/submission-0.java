class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> duplicateMap = new HashMap<>();
        for (int number : nums){
            if(!duplicateMap.containsKey(number)){
                duplicateMap.put(number, 1);
            }else {
                return true;
            }
        }
        return false;
    }
}
