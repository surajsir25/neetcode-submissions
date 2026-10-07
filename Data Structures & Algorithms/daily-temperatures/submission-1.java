class Solution {
    public int[] dailyTemperatures(int[] t) {
        
        // THIS IS A TWO POINTER SOLUTION WITH O(n^2)-tc
        
        // int[] res = new int[t.length];
        // int i=0, j=1;
        // if(t.length <2) {
        //     return new int[t.length];
        // }
        // while(i<t.length){
        //     if(j==t.length){
        //         res[i] = 0;
        //         i++;
        //         j=i+1;
        //     }
        //     else if(t[j]>t[i]){
        //         res[i] = j-i;
        //         i++;
        //         j=i+1;
        //     } else {
        //         j++;
        //     }
        // }
        // return res;


        // SOLUTION USING STACK,
        // so when we check for ith day if that day temperature is greater than previous day and if ith day temperature is not greater than previous day then definitly it is not greater than older days since the previous day temperature itself is not greater.
        int[] ans = new int[t.length];
        Deque<int[]> stack = new ArrayDeque<>();
        for(int i=0; i<t.length; i++){
            int temp = t[i];
            while(!stack.isEmpty() && temp > stack.peek()[0]){
                int[] val = stack.pop();
                ans[val[1]] = i-val[1];
            }
            stack.push(new int[]{temp, i});
        }
        return ans;
    }
}
