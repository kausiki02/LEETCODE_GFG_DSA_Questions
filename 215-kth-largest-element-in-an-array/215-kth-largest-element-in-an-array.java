class Solution {
    public int findKthLargest(int[] nums, int k) {
        //example 1 = returning second largest element
        
        PriorityQueue<Integer> p = new PriorityQueue<Integer>();
        
        for(int i =0; i<k; i++){
                p.add(nums[i]);
        }
        for(int i=k; i<nums.length;i++){
            
                if(p.peek()<nums[i]){
                    p.remove();
                    p.add(nums[i]);
                }
            }
        return p.peek();
        }
    }
