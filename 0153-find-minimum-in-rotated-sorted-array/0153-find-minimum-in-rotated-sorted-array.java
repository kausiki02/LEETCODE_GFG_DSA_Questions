class Solution {
    public int findMin(int[] nums) {

        int low =0; int high = nums.length-1; 
        int ans = Integer.MAX_VALUE;

        while(low<=high){
            int mid = (low+high)/2;

            //left sorted
            if(nums[low]<=nums[mid]){
                ans = Math.min(ans, nums[low]); //store the minimum
                low = mid+1; //eliminate the left half
            }
            else{ //right sorted
                ans = Math.min(ans, nums[mid]); //in the right half sorted array the minimum would be the mid
                high = mid-1; //eliminate the right half
            }
        }
        return ans;
        
    }
}