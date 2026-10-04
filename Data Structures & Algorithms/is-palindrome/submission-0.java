class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0, r = s.length()-1;
        while(l<r) {
            if(validChar(s.charAt(l)) && validChar(s.charAt(r))){
                if(s.charAt(l) == s.charAt(r)){
                    l++;
                    r--;
                    continue;
                } else {
                    return false;
                }
            }
            if(validChar(s.charAt(l))){
                r--;
            }else {
                l++;
            }
        }
        return true;
    }

    public boolean validChar(Character c){
        if((c >= 'A' && c <= 'Z') || (c >= 'a' && c<='z') || (c >= '0' && c <= '9')){
            return true;
        }
        return false;
    }
}
