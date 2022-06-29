class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        if(nums[0]==0) return false;
        
        int max=0;
        
        for(int i=0; i<nums.length; i++){
            if(i<=max){
                max = Math.max(max, i+nums[i]);
            }
        }
            if(max>=nums.length-1){
                return true;
            }
            else 
                return false;
    }
}