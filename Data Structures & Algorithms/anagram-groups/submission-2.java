class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            int[] arr = new int[26];
            for(int j=0; j<26; j++) {
                arr[j] = 0;
            }
            for(int j=0; j<strs[i].length(); j++){
                arr[strs[i].charAt(j) - 97]+=1;
            }
            StringBuilder sb = new StringBuilder();
            for(int n : arr){
                sb.append("#").append(n);
            }
            String mapKey = sb.toString();
            map.putIfAbsent(mapKey, new ArrayList<>());
            map.get(mapKey).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
