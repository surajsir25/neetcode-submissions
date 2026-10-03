class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for(int st : stones) {
            p.offer(st);
        }
        while(p.size()>1){
            int one = p.poll();
            int two = p.poll();
            if(one > two) {
                p.offer(one - two);
            }
            if (two > one) {
                p.offer(two - one);
            }
        }
        return p.size()>0? p.poll():0;
    }
}
