class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String st : strs){
            int len = st.length();
            sb.append(len).append("#").append(st);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int len = 0;
            while(str.charAt(i) != '#'){
                len = len * 10 + (str.charAt(i) - '0');
                i++;
            }
            i++;
            String sub = str.substring(i, i + len);
            ans.add(sub);
            i = i + len;
        }
        return ans;
    }
}
