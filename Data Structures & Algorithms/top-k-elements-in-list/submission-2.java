class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Using sorting

        // Map<Integer, Integer> map = new HashMap<>();
        // for(int num : nums) {
        //     map.put(num, map.getOrDefault(num, 0)+1);
        // }
        // List<int[]> arr = new ArrayList<>();
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     arr.add(new int[]{entry.getValue(), entry.getKey()});
        // }
        // arr.sort((a, b) -> b[0] - a[0]);
        // int[] res = new int[k];
        // for(int i=0; i<k; i++) {
        //     res[i] = arr.get(i)[1];
        // }
        // return res;


        // Using min-Heap

        // Map<Integer, Integer> map = new HashMap<>();
        // for(int num : nums) {
        //     map.put(num, map.getOrDefault(num, 0)+1);
        // }

        // PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0]-b[0]); //main clue
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     heap.offer(new int[]{entry.getValue(), entry.getKey()});
        //     if(heap.size() > k) {
        //         heap.poll();
        //     }
        // }

        // int[] res = new int[k];
        // for(int i=0; i<k; i++){
        //     res[i] = heap.peek()[1];
        //     heap.poll();
        // }
        // return res;


        //Bucket sort 

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] freq = new List[nums.length + 1];
        for(int i=0; i<=nums.length ; i++){
            freq[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for(int i = freq.length - 1; i>0 && index < k; i --) {
            for(int n: freq[i]){
                res[index] = n;
                index++;
                if(index==k) {
                    return res;
                }
            }            
        }
        return res;

    }
}
