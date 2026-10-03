class KthLargest {
    private PriorityQueue<Integer> p;
    private int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.p = new PriorityQueue<>();
        for(int n : nums) {
            p.offer(n);
            if(p.size()> k){
                p.poll();
            }
        }
    }
    
    public int add(int val) {
        p.offer(val);
        if(p.size()>k) {
            p.poll();
        }
        return p.peek();
    }
}
