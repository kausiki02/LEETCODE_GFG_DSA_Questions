class Solution {
    public int candy(int[] ratings) {
        
        
        int candy[] = new int[ratings.length];
        
        for(int i=0; i<ratings.length; i++){
            candy[i] = 1;
        }
        
        
        for(int i=0; i<ratings.length-1; i++){
            if(ratings[i+1]>ratings[i]){
                
                candy[i+1] = candy[i]+1;
            }
        }
        
        for(int i=ratings.length-1; i>0; i--){
            if(ratings[i-1]>ratings[i]){
                if(candy[i-1]<(candy[i]+1))
                {
                    candy[i-1] = candy[i]+1;
                }
            }
        }
        
        int minCandy=0;
        for(int i=0; i<candy.length; i++){
            minCandy = minCandy+candy[i];
        }
        return minCandy;
    }
}