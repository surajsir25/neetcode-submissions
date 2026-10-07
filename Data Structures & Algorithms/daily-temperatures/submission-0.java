class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] res = new int[t.length];
        int i=0, j=1;
        if(t.length <2) {
            return new int[t.length];
        }
        while(i<t.length){
            if(j==t.length){
                res[i] = 0;
                i++;
                j=i+1;
            }
            else if(t[j]>t[i]){
                res[i] = j-i;
                i++;
                j=i+1;
            } else {
                j++;
            }
        }
        return res;
    }
}
