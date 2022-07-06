class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        for(int i=0; i<nums.length; i++){
             hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> hm.get(b) - hm.get(a));
        
        for(int key : hm.keySet()){
            minHeap.add(key);
        }
        int res[] = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = minHeap.poll();
        }
        return res;
    }
}