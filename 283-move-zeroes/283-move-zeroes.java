class Solution {
    public void moveZeroes(int[] nums) {
        //two pointer approach 
        // right will keep track of non zero value and left will keep track of zero.
        
        //Approach is simple if right encounters a 0 it move forwards and
        //if the next element is a non zero it swaps the left pointer's element 
        //which is a 0 with the right pointer's element
        
        int left=0;
        int right=0;
        
        while(right<nums.length){
            
            if(nums[right]==0){ // when we encounter a 0 we move forward
                ++right;
            }
            else{ 
                //when nums[right] is some value other than 0
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                ++left;
                ++right;
            }
        }
    }
}