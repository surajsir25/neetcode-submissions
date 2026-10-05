class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> m = new HashMap<>();
        int maxl = 0;
        int l =0;
        if(s.length()<2) {
            return s.length();
        }
        m.put(s.charAt(0),0);
        maxl++;
        for(int r = 1; r<s.length(); r++){
            if(m.containsKey(s.charAt(r))){
                int val = m.get(s.charAt(r));
                if(val >= l){
                    l = m.get(s.charAt(r)) +1;
                } else {
                    maxl = Math.max(maxl, (r-l) + 1);
                }
            }
            else {
                maxl = Math.max(maxl, (r-l)+1);
            }
            m.put(s.charAt(r), r);
        }
        return maxl;
    }
}
