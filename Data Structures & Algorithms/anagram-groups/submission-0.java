class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ansList = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i ++) {
            int[] arr = new int[26];

            for(int j =0; j< strs[i].length(); j++) {
                arr[strs[i].charAt(j) - 97]++;
            }
            StringBuilder sb = new StringBuilder();
            for (int count : arr) {
                sb.append('#').append(count);
            }
            String key = sb.toString();

            if(map.containsKey(key)){
                List<String> list = map.get(key);
                list.add(strs[i]);
                map.put(key, list);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(strs[i]);
                map.put(key, newList);
            }

        }

        for(List<String> list : map.values()) {
            ansList.add(list);
        }

        return ansList;
    }
}
