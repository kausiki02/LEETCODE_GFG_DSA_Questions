class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        
/*Explanation && Idea:
*Some observations:

with ladder we can cover any height . So will Prefer ladder to cover large difference.
If next building height is greater than only we need brick or ladder to cross it , if next building height if less than current building we can directly jump.
*Algorithm:
Go greedly

First use all the ladders whenever we have to go to higher building and also add the difference b/w height in min_heap.
if min_heap.size()==ladders it means we have used all the ladders.
now let say after all ladders are used and we we found a larger building , add difference to min_heap and use bricks at a place where height difference is minimum by replacing the ladder from that place.*/
        
        //best and easiest sol
        PriorityQueue<Integer> min_heap=new PriorityQueue<>();  
          
        for(int i=0;i<heights.length-1;i++){
            int diff=heights[i+1]-heights[i];  // diff: difference
            
            if(diff>0){
                min_heap.add(diff);
            }
            
            if(min_heap.size()>ladders){
                bricks-=min_heap.remove();
            }
            
            if(bricks<0){  //means both bricks and ladder are finished .
                return i;
            }
        }  
       return heights.length-1;
}
}