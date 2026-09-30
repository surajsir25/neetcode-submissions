class Solution {

    public String encode(List<String> strs) {
        String encoded = "";
        for (String str : strs){
            int len = str.length();
            encoded = encoded + String.valueOf(len) + ":" + str ;
        }
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            String len = "";
            while(str.charAt(i) != ':'){
                len = len + str.charAt(i);
                i++;
            }
            i++;
            int j = i + Integer.parseInt(len);
            strs.add(str.substring(i, j));
            i = j;
        }
        return strs;
    }
}
