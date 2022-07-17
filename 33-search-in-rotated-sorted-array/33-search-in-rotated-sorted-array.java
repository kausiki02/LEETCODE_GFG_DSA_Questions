class Solution {
    public int search(int[] nums, int target) {
        //binary search
        
        int low = 0; int high = nums.length-1;
        
        while(low<=high){
             int mid = (low+high)/2;
             if(nums[mid] == target){
                 return mid;
             }
            
            //check if the left side is sorted or not
            if(nums[low]<=nums[mid]){
                //figure out if your element lies on the left half or not
                if(nums[low]<=target && target<=nums[mid]){
                    high = mid -1;
                }
                else{
                    low = mid+1;
                }
            }
            //if left half not sorted then right half is sorted 
            else{
                if(target>= nums[mid] && target<= nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}