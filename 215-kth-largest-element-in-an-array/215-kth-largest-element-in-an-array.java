class Solution {
    public int findKthLargest(int[] nums, int k) {
        //example 1 = returning second largest element
        
        PriorityQueue<Integer> p = new PriorityQueue<Integer>();
        
        for(int i =0; i<nums.length; i++){
            if(p.size()<k){
                p.add(nums[i]);
            }
            else{
                if(p.peek()<nums[i]){
                    p.remove();
                    p.add(nums[i]);
                }
            }
        }
        return p.peek();
    }
}