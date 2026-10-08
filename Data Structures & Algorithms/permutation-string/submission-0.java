class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map1 = new HashMap<>();
        for(int i = 0; i<s1.length(); i++){
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0)+1);
        }
        int size1 = s1.length();
        if(s2.length()<size1){
            return false;
        }
        int i=0;
        Map<Character, Integer> map2 = new HashMap<>();

        for(; i<size1; i++){
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0)+1);
        }
        if(map1.equals(map2)){
            return true;
        }
        for(int j=size1; j<s2.length(); j++){
            int val = map2.get(s2.charAt(j-size1));
            if(val<2){
                map2.remove(s2.charAt(j-size1));
            }else {
                map2.put(s2.charAt(j-size1), map2.getOrDefault(s2.charAt(j-size1), 0)-1);
            }
            map2.put(s2.charAt(j), map2.getOrDefault(s2.charAt(j), 0)+1);
            if(map2.equals(map1)){
                return true;
            }
        }
        return false;
    }
}
