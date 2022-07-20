class Solution {
    public int mySqrt(int x) {
        int len = x;
        int low = 0;
        int high = len;
        int ans =0;
        
        while(low<=high){
            long mid = low+(high-low)/2;
            if(mid*mid<=x){
                ans = (int)mid;
                low =(int) mid+1;
            }
            else{
                high = (int)mid-1;
            }
        }
        return ans;
    }
}