class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> p = new PriorityQueue<>((a, b) ->{
            double d1 = Math.sqrt(Math.pow(a[0], 2) + Math.pow(a[1], 2));
            double d2 = Math.sqrt(Math.pow(b[0], 2) + Math.pow(b[1], 2));
            if(d1>d2) {
                return -1;
            }
            else {
                return 1;
            }
        });
        for(int[] arr : points) {
            p.offer(arr);
            if(p.size()>k){
                p.poll();
            }
        }
        int[][] ans = new int[k][2];
        for(int i=0; i<k; i++){
            int[] point = p.poll();
            ans[i] = new int[]{point[0], point[1]};
        }
        return ans;
    }
}
