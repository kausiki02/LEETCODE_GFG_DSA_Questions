class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low<=high){
           int mid = (low+high)/2;

           if(nums[mid] == target) return mid;

           //if not found then identify the sorted half
           //either left half will be sorted or right half will be sorted.

            //for the left half to be sorted it has to follow the sorted property
            //nums[low] < = nums[mid]
            //left sorted
            if(nums[low]<= nums [mid]){
                //if the left is sorted compare the target that it lies between the low and mid
                 if(nums[low]<=target && target <= nums[mid])
                 //if the target lies on the left half eliminate right
                    high = mid-1;
                else 
                //if not then eliminate the left half
                    low = mid+1;
            }
            //right sorted
            else{
            //same for the right sorted array
            if(nums[mid] <= target && target<= nums[high]) //right half is sorted and target to lie on the right half target has to be greater than mid and smaller than high 
            {
                low = mid+1; //target lying on right half eliminate left if not elimate right
            }
            else {
                high = mid-1; //eliminate right
            }
            }
        }
        return -1;
    }
}