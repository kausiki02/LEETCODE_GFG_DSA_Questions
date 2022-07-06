/*class Pair{
        int diff;
        int val;
    
    public Pair(int key, int value){
        this.diff = diff;
        this.val = val;
    }
 }*/

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       /* PriorityQueue<Pair> pqmax = new PriorityQueue<Pair>(new Comparator<Pair>(){
           public int compare(Pair o1, Pair o2){
               if((o1.diff-o2.diff)==0)
                    return o1.val - o2.val;
               else
                   return o1.diff-o2.diff;
           } 
        });
        
        
        for(int i=0; i<arr.length; i++){
            pqmax.add(new Pair(Math.abs(arr[i]-x),arr[i]));
            
            if(pqmax.size()>k){
                pqmax.poll();
            }
        }
        
    List<Integer> ans = new ArrayList<Integer>();
         for (int i = k - 1; i >= 0; i--) {
           ans.add(pqmax.poll().val);
       }
        Collections.sort(ans);
        return ans;*/
        
        
        PriorityQueue<Integer> pqmax = new PriorityQueue<Integer>(arr.length,(o1,o2)->
        {
               if(Math.abs(o1-x)==Math.abs(o2-x)) 
               {
                   if(o1>o2) return -1;
                   return 1;
               }
               else if(Math.abs(o1-x)>Math.abs(o2-x)) return -1;  
               else return 1;
        });
        
        for(int i=0; i<arr.length; i++ )
        {
            pqmax.add(arr[i]);
            if(pqmax.size()>k) 
                pqmax.poll();
        }
        
        List<Integer> result = new ArrayList<>();
        while(pqmax.size()>0){
            result.add(pqmax.remove());
        } 
        Collections.sort(result);
        return result;
    }
}