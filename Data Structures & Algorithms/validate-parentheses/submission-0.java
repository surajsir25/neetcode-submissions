class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for(Character c : s.toCharArray()) {
            if(c == '(') { 
                st.push(')');
            } else if(c == '[') { 
                st.push(']');
            } else if(c == '{') { 
                st.push('}');
            } else {
                if(st.isEmpty() || st.peek() != c){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
