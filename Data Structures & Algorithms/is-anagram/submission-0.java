class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        int i = 0;
        while(i<s.length()) {
            int val = s.charAt(i);
            arr[val-97]++;
            val = t.charAt(i);
            arr[val-97]--;
            i++;
        }
        int sum = 0;
        for(int j : arr) {
            if(j != 0) {
                return false;
            }
        }
        return true;
    }
}
