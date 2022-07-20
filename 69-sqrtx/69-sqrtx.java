class Solution {
    public int mySqrt(int x) {
        int len = x;
        int low = 0;
        int high = len;
        
        while(low<=high){
            long mid = low+(high-low)/2;
            if(x== mid*mid){
                return (int)mid;
            }
            else if(x<mid*mid){
                high = (int)mid-1;
            }
            else{
                low = (int)mid+1;
            }
        }
        return high;
    }
}