class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0, high = nums.length-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(nums[mid]==target) return true;

            //duplicate elements condition where
            if(nums[low]==nums[mid]&& nums[mid] == nums[high]){
                //trim down the search space
                low = low+1;
                high = high-1;
                continue; //continue until this duplicate elements condition expires.
            }
            //left sorted

            if(nums[low]<= nums[mid] ){
                if(nums[low]<=target && target <= nums[mid]){
                    high = mid-1;
                }
                else
                    low = mid+1;
            }

            //right sorted
            else{ //that means right is sorted
                if(nums[mid]<=target && target <= nums[high])
                    low = mid+1;
                else
                    high = mid-1;
             }
        }
        return false;
    }
}