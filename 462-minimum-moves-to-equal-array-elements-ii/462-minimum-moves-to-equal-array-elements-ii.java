class Solution {
    public int minMoves2(int[] nums) {
        //basic idea is to find median so that least number of operations are required
/*Let's first imagine we picked the smallest element as our target. What happens in this situation is we end up maximising the number of operations needed to get the largest element down to the target. If the largest number is really large or there are a lot of larger numbers, then this can end up totalling to a lot of operations.
If we instead picked the largest element as our target, the same thing happens but for smaller elements.
Therefore, intuitively, it's reasonable to suggest that if we picked the median element, we'll get the best of both worlds.*/
        
        Arrays.sort(nums);
        if (nums == null || nums.length == 0)
            return 0;
        
        int operations = 0;
        int mid = nums.length/2;
        
        for(int i=0; i<nums.length; i++){
            operations = operations + Math.abs(nums[i]-nums[mid]); //abs since +/- 
        }
        return operations;
    }
    
}