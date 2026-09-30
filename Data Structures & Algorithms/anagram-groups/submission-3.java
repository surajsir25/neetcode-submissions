class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            int[] arr = new int[26];
            for(int j=0; j<strs[i].length(); j++){
                arr[strs[i].charAt(j)-'a']+=1;
            }
            StringBuilder sb = new StringBuilder();
            for(int n : arr){
                sb.append("#").append(n);
                //#1#0#1#0 ..... #0#1#0...#0
            }
            String key = sb.toString();
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
