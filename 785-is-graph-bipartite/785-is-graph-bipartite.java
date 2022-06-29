class Solution {
    
    public boolean dfsCheck(int[][]graph,int node, int color[]){

        if(color[node]==-1){
            color[node] = 1;
        }
        
        for(Integer it: graph[node]){
            if(color[it]==-1){
                color[it]= 1-color[node];
                
                if(!dfsCheck(graph,it,color)){
                    return false;
                }
            }
            else if(color[it]==color[node]){
                return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int color[] = new int[graph.length];
        for(int i=0; i<graph.length; i++){
            color[i] =-1;
        }
        
        for(int i=0; i<graph.length; i++){
            if(color[i]==-1){
                if(!dfsCheck(graph,i,color)){
                    return false;
                }
            }
        }
        return true;
    }
}