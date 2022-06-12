class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxSum = 0;
        int currSum = 0;
        
        for (int l = 0, r = 0; r < nums.length; r++) {
            // let's add our next value 
			currSum += nums[r];
            
            // if the next element is already in the current set 
        // we need to move our l pointer 
    			if (set.contains(nums[r])) {
        // delete the values until we have found the non-unique value 
				while (nums[l] != nums[r]) {
					currSum -= nums[l];
					set.remove(nums[l]);
					l++;
				}
        // now we have found the non-unique value in our current case 
        // lets remove it both currSum and our set 
				if (nums[l] == nums[r]) {
					currSum -= nums[l];
					set.remove(nums[l]);
					l++;
				}
			}
        // add current value to the set 
			set.add(nums[r]);
        // compare the current case with previous cases to get maximum value .
			maxSum = Math.max(currSum, maxSum);

		}
		return maxSum;
	}
}